package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class SquareAndCircleChecker {

    @Step
    public String checkCircleInSquare(double circleArea, double squareArea) {

//        TODO implements result
        String result = "";
        double D1, D2;
        D1 = Math.sqrt(squareArea) / 2;
        D2 = Math.sqrt(circleArea / Math.PI);

        if (D2 <= D1) {
            result = "The circle is in the square";
        } else {
            result = "The circle is not in the square";
        }
        return result;
    }


        @Step
        public String checkSquareInCircle(double circleArea2, double squareArea2){

//        TODO implements result
            String result = "";
            double D3, D4;
            double D5;
            D3 = Math.sqrt(squareArea2); // сторона квадрата
            D4 = Math.sqrt(Math.pow(D3,2)+Math.pow(D3,2)); // диагональ квадрата
            D5 = Math.sqrt(circleArea2 / Math.PI)*2; // диаметр круга

            if (D5 >= D4) {
                result = "The square is in the circle";
            } else {
                result = "The square is not in the circle";

            }
            return result;
        }
    }
