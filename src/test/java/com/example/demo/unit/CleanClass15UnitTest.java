package com.example.demo.unit;

import com.example.demo.clean.CleanClass15;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CleanClass15UnitTest {

    @Test
    void processProducesNonNegativeResults() {
        CleanClass15 subject = new CleanClass15();
        int value = subject.process(5);
        assertTrue(value >= 0);
    }
}
