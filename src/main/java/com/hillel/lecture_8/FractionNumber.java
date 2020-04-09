package com.hillel.lecture_8;

import java.util.Objects;

public class FractionNumber {
    private  int num;
    private  int denom;

    public FractionNumber(int numerator, int denominator){
        this.num = numerator;
        this.denom = denominator;
        reduce();
        if (this.denom < 0){
            this.denom = -this.denom;
            this.num = -this.num;
        }
    }
    public int getNumerator() {
        return num;
    }
    public void setNumerator(int numerator) {
        this.num = numerator;
    }
    public int getDenominator() {
        return denom;
    }
    public void setDenominator(int denominator) {
        this.denom = denominator;
    }
    private int calculateCGD(int nominator, int denominator){
        // Евклидов алгоритм
        int tempNominator=nominator;
        int temp = 0;
        int tempDenominator=denominator;
        while (tempDenominator != 0){
            temp = tempDenominator;
            tempDenominator = tempNominator % tempDenominator;
            tempNominator=temp;
        }
        return temp;
    }

    private void reduce(){
        int gcd = calculateCGD(num, denom);
        num /= gcd;
        denom /= gcd;
    }

    public String toString(){           //числа в виде дробей
        if (this.denom < 0){
            return "-"+this.num + "/" + Math.abs(this.denom);
        } else {
            return this.num + "/" + this.denom;
        }
    }

    public FractionNumber plus(FractionNumber fTwo){
        int firstNum = this.num;
        int firstDen = this.denom;
        int secondNum = fTwo.num;
        int secondDen = fTwo.denom;

        int numer = (firstNum*secondDen)+(secondNum*firstDen);
        int denom = firstDen*secondDen;

        FractionNumber f3 = new FractionNumber(numer,denom);

        System.out.println(String.format("Result of Plus %s/%s and %s/%s is: %s", firstNum, firstDen, secondNum, secondDen, f3.toString()));

        return f3;
    }

    public FractionNumber minus(FractionNumber fTwo){
        int firstNum = this.num;
        int firstDen = this.denom;
        int secondNum = fTwo.num;
        int secondDen = fTwo.denom;

        int numer = (firstNum*secondDen)-(secondNum*firstDen);
        int denom = firstDen*secondDen;

        FractionNumber f3 = new FractionNumber(numer,denom);

        System.out.println(String.format("Result of Minus %s and %s is: %s", this.toString(), fTwo.toString(), f3.toString()));

        return f3;
    }

    public FractionNumber multiply(FractionNumber fTwo){

        int firstNum = this.num;
        int firstDen = this.denom;
        int secondNum = fTwo.num;
        int secondDen = fTwo.denom;

        int numer = firstNum*secondNum;
        int denom = firstDen*secondDen;

        FractionNumber f3 = new FractionNumber(numer,denom);

        System.out.println(String.format("Result of Multiply %s and %s is: %s", this.toString(), fTwo.toString(), f3.toString()));

        return f3;
    }

    public FractionNumber divide(FractionNumber fTwo){

        int firstNum = this.num;
        int firstDen = this.denom;
        int secondNum = fTwo.num;
        int secondDen = fTwo.denom;

        int numer =firstNum*secondDen;
        int denom = firstDen*secondNum;

        FractionNumber f3 = new FractionNumber(numer,denom);

        System.out.println(String.format("Result of Divide %s and %s is: %s", this.toString(), fTwo.toString(), f3.toString()));

        return f3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FractionNumber that = (FractionNumber) o;
        return num == that.num &&
                denom == that.denom;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, denom);
    }
}
