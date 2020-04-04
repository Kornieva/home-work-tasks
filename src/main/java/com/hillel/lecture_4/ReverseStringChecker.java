package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/26/19
 */
public class ReverseStringChecker {

    @Step
    public String getReversString(String value) {

//        TODO implements result
        /*String result = "";

        char[] charString = value.toCharArray();
        for (int i = charString.length - 1; i >= 0; i--) {
            result = result + charString[i];
        }
        return result;
    }
}*/
            return reverseString(value);
    }

        public static String reverseString(String value) {
            String result = "";

            char[] charString = value.toCharArray();
            for (int i = charString.length - 1; i >= 0; i--) {
                result = result + charString[i];
            }
            return result;
        }
    }

