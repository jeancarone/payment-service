package com.example.demo.unit;

import com.example.demo.clean.CleanClass10;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CleanClass10UnitTest {

    @Test
    void processProducesNonNegativeResults() {
        CleanClass10 subject = new CleanClass10();
        int value = subject.process(5);
        assertTrue(value >= 0);
    }
}
