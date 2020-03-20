package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class MinValueChecker {

    @Step
    public int getValue(int[] values) {

//        TODO implements result
            int minValue = values[0];
            for (int i = 1; i < values.length; i++) {
                if (values[i] < minValue) {
                    minValue = values[i];
                }
            }
            return minValue;
        }
    }






