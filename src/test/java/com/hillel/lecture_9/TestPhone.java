package com.hillel.lecture_9;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestPhone {

    @Test
    public void cellPhoneTest() {

        CellPhone cellPhone = new CellPhone("Vodafon", "Cell phone", "iOS", "red", "+380993332211");

        CellPhone expectedResult = new CellPhone("Vodafon", "Cell phone", "iOS", "red", "+380993332211" );

        assertEquals(cellPhone.hashCode(), expectedResult.hashCode());
    }

    @Test
    public void landLinePhoneTest() {

        LandLinePhone homePhone = new LandLinePhone("Fregat", "Landline phone", "absent", "white", "80565674321");
        LandLinePhone expectedResult = new LandLinePhone("Fregat", "Landline phone", "absent", "white", "80565674321");

        assertEquals(homePhone, expectedResult);

    }

    @Test
    public void equalsPhone() {

        LandLinePhone homePhone = new LandLinePhone("Fregat", "Landline phone", "absent", "white", "80565674321");

        CellPhone cellPhone = new CellPhone("Vodafon", "Cell phone", "iOS", "red", "+380993332211");

        assertEquals(homePhone.hashCode() == cellPhone.hashCode(), false);

    }
}
