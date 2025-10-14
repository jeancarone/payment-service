package com.example.demo.unit;

import com.example.demo.clean.CleanClass14;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CleanClass14UnitTest {

    @Test
    void processProducesNonNegativeResults() {
        CleanClass14 subject = new CleanClass14();
        int value = subject.process(5);
        assertTrue(value >= 0);
    }
}
