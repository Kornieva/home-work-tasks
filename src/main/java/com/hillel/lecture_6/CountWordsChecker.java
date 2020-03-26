package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class CountWordsChecker {

    @Step
    public int countNumberOfWorld(String sentence) {

//        TODO implements resul

            int count = 0;
            if(sentence.length() != 0){
                count++;
                for (int i = 0; i < sentence.length(); i++) {
                    if(sentence.charAt(i) == ' '){
                        count++;
                    }
                }
            }

        return count;
    }
}
