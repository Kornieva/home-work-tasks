package com.hillel.lecture_1;

public class SumOfGiven {
    public static void main(String[] args) {
        int [] array = {1, 1, 2, 3, 5, 8, 21};
        int arraySumResult = 0;
        System.out.println ("Array number sum result: " + arraySumResult );

    }
    public static int arraySumCalculation (int [] array){
        int sumValuesResult = 0;
        for (int value: array) {
            sumValuesResult +=value;

        }
        return sumValuesResult;
    }
}
