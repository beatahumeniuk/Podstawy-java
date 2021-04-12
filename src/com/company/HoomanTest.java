package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HoomanTest {
    @Test
    public void testGreeting() {
        Hooman testHooman = new Hooman("Piotr", "Olsztyn", 35);

        String expectedResult = "Witaj Piotr w Olsztyn.";
        String actualResult = testHooman.greeting();

//        if (expectedResult.equals(actualResult)) {
//            // test przeszedł
//        } else {
//            // test nie przeszedł
//        }

//        boolean result = expectedResult.equals(actualResult);
//        Assertions.assertTrue(result);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testToString() {
        Hooman testHooman = new Hooman("Piotr", "Olsztyn", 35);

        String expectedResult = "Name: Piotr, City: Olsztyn, Age: 35";
        String actualResult = testHooman.toString();

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
