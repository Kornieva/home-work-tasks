package com.hillel.lecture_11;

public class KilogramsToPounds2 implements  Converter {

    @Override
    public double convert(double value) {
        return value*2.20462;
    }
}
