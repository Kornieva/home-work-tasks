package com.hillel.lecture_11;

public class InchesToMeters2 implements Converter{


    @Override
    public double convert(double value) {
        return value/39.37;
    }
}
