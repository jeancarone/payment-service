package com.example.demo.unit;

import com.example.demo.clean.CleanClass2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CleanClass2UnitTest {

    @Test
    void processProducesNonNegativeResults() {
        CleanClass2 subject = new CleanClass2();
        int value = subject.process(5);
        assertTrue(value >= 0);
    }
}
