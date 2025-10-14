package com.example.demo.unit;

import com.example.demo.clean.CleanClass8;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CleanClass8UnitTest {

    @Test
    void processProducesNonNegativeResults() {
        CleanClass8 subject = new CleanClass8();
        int value = subject.process(5);
        assertTrue(value >= 0);
    }
}
