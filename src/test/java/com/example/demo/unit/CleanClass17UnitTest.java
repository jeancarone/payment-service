package com.example.demo.unit;

import com.example.demo.clean.CleanClass17;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CleanClass17UnitTest {

    @Test
    void processProducesNonNegativeResults() {
        CleanClass17 subject = new CleanClass17();
        int value = subject.process(5);
        assertTrue(value >= 0);
    }
}
