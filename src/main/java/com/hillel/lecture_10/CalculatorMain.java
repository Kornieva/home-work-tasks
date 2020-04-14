package com.hillel.lecture_10;


public class CalculatorMain {

    public static void main(String[] args) {

       Simple_calculator simple = new Simple_calculator();
       Engineering_calculator engineering = new Engineering_calculator();


        simple.plus();
        engineering.multiply();
        simple.divide();
        engineering.minus();
        engineering.fractions();
        simple.percent();

    }

}



