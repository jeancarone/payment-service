package com.example.demo.integration;

import com.example.demo.clean.CleanClass25;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CleanClass25IT {

    @Test
    void contextLoadsAndProcessesValues() {
        CleanClass25 subject = new CleanClass25();
        int result = subject.process(4);
        assertTrue(result >= 0);
    }
}
