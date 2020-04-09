package com.hillel.lecture_8;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FractionNumberTest {


    @Test
    public void FractionNumbersPlus() {
        FractionNumber f1 = new FractionNumber(1,5);
        FractionNumber f2 = new FractionNumber(3,5);
        FractionNumber expectedResult = new FractionNumber(4,5);
        FractionNumber f3 = f1.plus(f2);

        assertEquals(f3, expectedResult);
    }

    @Test
    public void FractionNumbersMinus() {
        FractionNumber f1 = new FractionNumber(1,5);
        FractionNumber f2 = new FractionNumber(3,5);
        FractionNumber expectedResult = new FractionNumber(-2,5);
        FractionNumber f3 = f1.minus(f2);


        assertEquals(f3, expectedResult);
    }

    @Test
    public void FractionNumbersDivide() {
        FractionNumber f1 = new FractionNumber(1,5);
        FractionNumber f2 = new FractionNumber(3,5);
        FractionNumber expectedResult = new FractionNumber(1,3);
        FractionNumber f3 = f1.divide(f2);


        assertEquals(f3, expectedResult);
    }

    @Test
    public void FractionNumbersMultiply() {
        FractionNumber f1 = new FractionNumber(1,5);
        FractionNumber f2 = new FractionNumber(3,5);
        FractionNumber expectedResult = new FractionNumber(3,25);
        FractionNumber f3 = f1.multiply(f2);


        assertEquals(f3, expectedResult);
    }

}