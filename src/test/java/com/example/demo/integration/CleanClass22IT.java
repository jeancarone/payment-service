package com.example.demo.integration;

import com.example.demo.clean.CleanClass22;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CleanClass22IT {

    @Test
    void contextLoadsAndProcessesValues() {
        CleanClass22 subject = new CleanClass22();
        int result = subject.process(4);
        assertTrue(result >= 0);
    }
}
