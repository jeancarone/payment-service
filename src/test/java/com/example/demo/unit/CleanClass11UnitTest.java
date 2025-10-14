package com.example.demo.unit;

import com.example.demo.clean.CleanClass11;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CleanClass11UnitTest {

    @Test
    void processProducesNonNegativeResults() {
        CleanClass11 subject = new CleanClass11();
        int value = subject.process(5);
        assertTrue(value >= 0);
    }
}
