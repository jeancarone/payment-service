package com.example.demo.unit;

import com.example.demo.clean.CleanClass9;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CleanClass9UnitTest {

    @Test
    void processProducesNonNegativeResults() {
        CleanClass9 subject = new CleanClass9();
        int value = subject.process(5);
        assertTrue(value >= 0);
    }
}
