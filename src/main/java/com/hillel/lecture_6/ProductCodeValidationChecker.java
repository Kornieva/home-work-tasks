package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class ProductCodeValidationChecker {


    @Step
    public boolean validateCode(String code) {

//        TODO implements result

        boolean isValidator = true;
        String[] split = code.split(" ");
        String one = split[0];
        String partOneValidatorLetters = one.replaceAll("[A-Z]", "");

        String lettersChecker = "a-z";

        for (int i = 0; i < lettersChecker.length(); i++) {
            for (int j = 0; j < partOneValidatorLetters.length(); j++) {
                if (lettersChecker.charAt(i) == partOneValidatorLetters.charAt(j)) {
                    isValidator = false;
                    break;
                }
            }
        }

        if (isValidator) {
            String lengthNumbers = one.replaceAll("[A-Z]", "");
            isValidator = lengthNumbers.length() == 6;
        }


        String two = split[1];

        if (isValidator) {

            String s = code.replaceAll("[A-Z]", "");
            split = s.split(" ");

            int number = Integer.parseInt(split[0]);
            int valid = Integer.parseInt(split[1]);
            int result = 1;

            while (number > 0) {
                result *= number % 100;
                number /= 100;
            }

            if (result == valid) {
                isValidator = true;
            }
            else{
                isValidator = false;
            }
        }
        return isValidator;
    }
}