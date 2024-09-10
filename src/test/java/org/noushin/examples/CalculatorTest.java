package org.noushin.examples;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void verifyMinusNumbers() {
        Calculator calc = new Calculator();

        int actual = calc.add(-1, -2);

        assertEquals(-3, actual);
    }
}