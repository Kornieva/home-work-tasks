package com.hillel.lecture_11;

public class PoundsToKilograms2 implements Converter {

    @Override
    public double convert(double value) {
        return value/2.2046;
    }
}
