package com.hillel.lecture_3;

import com.sun.prism.shader.Solid_ImagePattern_Loader;
import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class PassFailChecker {

    @Step
    public String checkNumber(int number) {

//        TODO implements result
        String result = "";
        if (number >= 50) {
            result = "PASS";
            System.out.print("DONE");
        } else {
            result = "FAIL";
            System.out.print("DONE");

        }
        return result;
    }
}