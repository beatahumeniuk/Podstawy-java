package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTets {

        @Test
        public void testSum() {
            Calculator calculator = new Calculator(5, 5);
            int result = calculator.sum();

            Assertions.assertEquals(10, result);
        }

        @Test
        public void testMultiplication() {
            Calculator calculator = new Calculator(5, 5);
            int result = calculator.multiplication();

            Assertions.assertEquals(25, result);


            calculator = new Calculator(-5, 5);
            result = calculator.multiplication();

            Assertions.assertEquals(-25, result);


            calculator = new Calculator(-5, 0);
            result = calculator.multiplication();

            Assertions.assertEquals(0, result);


            calculator = new Calculator(5, -5);
            result = calculator.multiplication();

            Assertions.assertEquals(-25, result);
        }
    }
