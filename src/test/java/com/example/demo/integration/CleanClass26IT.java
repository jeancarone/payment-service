package com.example.demo.integration;

import com.example.demo.clean.CleanClass26;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CleanClass26IT {

    @Test
    void contextLoadsAndProcessesValues() {
        CleanClass26 subject = new CleanClass26();
        int result = subject.process(4);
        assertTrue(result >= 0);
    }
}
