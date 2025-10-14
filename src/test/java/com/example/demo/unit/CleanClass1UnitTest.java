package com.example.demo.unit;

import com.example.demo.clean.CleanClass1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CleanClass1UnitTest {

    @Test
    void processProducesNonNegativeResults() {
        CleanClass1 subject = new CleanClass1();
        int value = subject.process(5);
        assertTrue(value >= 0);
    }
}
