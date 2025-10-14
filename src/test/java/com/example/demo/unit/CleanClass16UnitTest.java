package com.example.demo.unit;

import com.example.demo.clean.CleanClass16;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CleanClass16UnitTest {

    @Test
    void processProducesNonNegativeResults() {
        CleanClass16 subject = new CleanClass16();
        int value = subject.process(5);
        assertTrue(value >= 0);
    }
}
