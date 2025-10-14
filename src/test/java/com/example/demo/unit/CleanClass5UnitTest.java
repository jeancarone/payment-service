package com.example.demo.unit;

import com.example.demo.clean.CleanClass5;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CleanClass5UnitTest {

    @Test
    void processProducesNonNegativeResults() {
        CleanClass5 subject = new CleanClass5();
        int value = subject.process(5);
        assertTrue(value >= 0);
    }
}
