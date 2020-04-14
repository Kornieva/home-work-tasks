package com.hillel.lecture_10;

public class Engineering_calculator extends Calculator {

   public static final String ENGINEERING = "Engineering calculator";


    public void fractions () {
        System.out.println("Use function fractions in " + ENGINEERING);
    }

    public void logarithm () {
        System.out.println("Use function logarithm in " + ENGINEERING);
    }


    @Override
    public void plus() {
        System.out.println("Use function plus in " + ENGINEERING);
    }

    @Override
    public void minus() {
        System.out.println("Use function minus in " + ENGINEERING);
    }

    @Override
    public void multiply() {
        System.out.println("Use function multiply in " + ENGINEERING);
    }

    @Override
    public void divide() {
        System.out.println("Use function divide in " + ENGINEERING);
    }
}




