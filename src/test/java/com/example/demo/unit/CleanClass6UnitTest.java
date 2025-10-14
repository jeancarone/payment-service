package com.example.demo.unit;

import com.example.demo.clean.CleanClass6;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CleanClass6UnitTest {

    @Test
    void processProducesNonNegativeResults() {
        CleanClass6 subject = new CleanClass6();
        int value = subject.process(5);
        assertTrue(value >= 0);
    }
}
