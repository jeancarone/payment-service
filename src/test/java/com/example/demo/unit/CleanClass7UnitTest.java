package com.example.demo.unit;

import com.example.demo.clean.CleanClass7;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CleanClass7UnitTest {

    @Test
    void processProducesNonNegativeResults() {
        CleanClass7 subject = new CleanClass7();
        int value = subject.process(5);
        assertTrue(value >= 0);
    }
}
