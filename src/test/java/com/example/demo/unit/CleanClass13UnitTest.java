package com.example.demo.unit;

import com.example.demo.clean.CleanClass13;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CleanClass13UnitTest {

    @Test
    void processProducesNonNegativeResults() {
        CleanClass13 subject = new CleanClass13();
        int value = subject.process(5);
        assertTrue(value >= 0);
    }
}
