package com.example.demo.integration;

import com.example.demo.clean.CleanClass19;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CleanClass19IT {

    @Test
    void contextLoadsAndProcessesValues() {
        CleanClass19 subject = new CleanClass19();
        int result = subject.process(4);
        assertTrue(result >= 0);
    }
}
