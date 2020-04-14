package com.hillel.lecture_10;

public class Simple_calculator extends Calculator {

    public static final String SIMPLE = "Simple calculator";


    public void percent () {
        System.out.println("Use function percent in " + SIMPLE);
    }

    public void square_root () {
        System.out.println("Use function square root in " + SIMPLE );
    }

    @Override
    public void plus() {
        System.out.println("Use function plus in " + SIMPLE);
    }

    @Override
    public void minus() {
        System.out.println("Use function minus in " + SIMPLE);
    }

    @Override
    public void multiply() {
        System.out.println("Use function multiply in " + SIMPLE);
    }

    @Override
    public void divide() {
        System.out.println("Use function divide in " + SIMPLE);
    }
}


