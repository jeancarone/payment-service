package com.example.demo.unit;

import com.example.demo.clean.CleanClass12;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CleanClass12UnitTest {

    @Test
    void processProducesNonNegativeResults() {
        CleanClass12 subject = new CleanClass12();
        int value = subject.process(5);
        assertTrue(value >= 0);
    }
}
