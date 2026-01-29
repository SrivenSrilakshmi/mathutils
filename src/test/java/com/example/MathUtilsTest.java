package com.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    private MathUtils mathUtils;

    @BeforeEach
    void setUp() {
        mathUtils = new MathUtils();
    }

    @AfterEach
    void tearDown() {
        mathUtils = null;
    }

    @Test
    void add_shouldReturnSum() {
        assertEquals(5, mathUtils.add(2, 3));
    }

    @Test
    void subtract_shouldReturnDifference() {
        assertEquals(-1, mathUtils.subtract(2, 3));
    }

    @Test
    void multiply_shouldReturnProduct() {
        assertEquals(6, mathUtils.multiply(2, 3));
    }

    @Test
    void divide_shouldReturnQuotient() {
        assertEquals(2.5, mathUtils.divide(5, 2), 0.000001);
    }

    @Test
    void divide_byZero_shouldReturnMinusOne() {
        assertEquals(-1.0, mathUtils.divide(10, 0), 0.000001);
    }
}
