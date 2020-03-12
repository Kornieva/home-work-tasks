package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class QuadraticEquationChecker {

    @Step
    public String checkQuadraticEquation(double a, double b, double c) {
//        TODO implements result
        String result = "";

        double D = (b * b) - (4 * a * c);
        double x;
        x=-b/(2*a);
        double x1, x2;
        x1 = (-b + Math.sqrt(D))/(2*a);
        x2 = (-b - Math.sqrt(D))/(2*a);

        if (a==0){
            result = "The 'a' coefficient should not be zero!";
        }
        else if (D==0) {
            result = "Two real, identical roots: [x1 && x2] = " + x1;
        }
        else if (D>0) {
            result = "Discriminant: " + D + ", x1: " +  x1+  ", x2: " + x2;
        }

        else {
            result = "No roots on the set of real numbers!";
        }
        return result;
    }

}
