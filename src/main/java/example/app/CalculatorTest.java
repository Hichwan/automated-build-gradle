package com.example.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add_works() {
        Calculator c = new Calculator();
        assertEquals(12, c.add(7, 5));
    }

    @Test
    void divide_byZero_throws() {
        Calculator c = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> c.divide(10, 0));
    }
}
