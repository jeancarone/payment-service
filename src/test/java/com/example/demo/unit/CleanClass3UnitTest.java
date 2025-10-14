package com.example.demo.unit;

import com.example.demo.clean.CleanClass3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CleanClass3UnitTest {

    @Test
    void processProducesNonNegativeResults() {
        CleanClass3 subject = new CleanClass3();
        int value = subject.process(5);
        assertTrue(value >= 0);
    }
}
