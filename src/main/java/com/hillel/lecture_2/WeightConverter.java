package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/17/19
 */
public class WeightConverter {

    @Step

    public double kilogramsToPounds(double kilograms) {
//        TODO implements result
        //  double result = kilograms*2.20462;
        //return result;
        return kilogramsToPounds2(kilograms);
    }
    public double kilogramsToPounds2 (double kilograms) {
        double result = 2.20462*kilograms;
         return result; }

    @Step
    public double poundsToKilograms(double pounds) {
//        TODO implements result
        //double result = pounds / 2.2046;
        //return result;
        return  poundsToKilograms2(pounds);
    }
    public double poundsToKilograms2 (double pounds) {
        double result = pounds / 2.2046;
        return result;
    }

}
