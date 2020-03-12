package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class MaxMinAverageChecker {

    @Step
    public int getMaxNumber(int a, int b , int c) {

//        TODO implements result
        int result = 0;
        if (a == b && b == c && c == a) {
            result = 0;
        }  else if (a > b && a > c){
            result = a;
        } else if (b > a && b > c){
            result = b;
        } else{
            result = c;
        }
        return result;
    }

    @Step
    public int getAverageNumber(int a, int b , int c) {

//        TODO implements result
        int result = 0;
        if (a == b && b == c && c == a) {
            result = 0;
        } else {
            int max = Math.max(Math.max(a, b), c);
            int min = Math.min(Math.min(a, b), c);
            result = a + b + c - (min + max);
        }
        return result;
    }

    @Step
    public int getMinNumber(int a, int b , int c) {

//        TODO implements result
        int result = 0;
        if (a == b && b == c && c == a) {
            result = 0;
        } else {
            int min = Math.min(Math.min(a, b), c);

        }
        return result;
    }
}
