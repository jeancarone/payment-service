package com.example.demo.unit;

import com.example.demo.clean.CleanClass4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CleanClass4UnitTest {

    @Test
    void processProducesNonNegativeResults() {
        CleanClass4 subject = new CleanClass4();
        int value = subject.process(5);
        assertTrue(value >= 0);
    }
}
