package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class CountWordsOfEachLengthChecker {

    @Step
    public int countNumberOfWorldWithLength(String sentence, int wordLength) {


//        TODO implements result
        int result = 0;

        String[] strings = sentence.split(" ");

        for (int i = 0; i < strings.length; i++) {
            String n = strings[i];
            if (n.replace(",", "").replace(".", "").length() == wordLength) {
                result++;
            }
        }

        return result;
    }
}


