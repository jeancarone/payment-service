package com.example.demo.integration;

import com.example.demo.clean.CleanClass29;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CleanClass29IT {

    @Test
    void contextLoadsAndProcessesValues() {
        CleanClass29 subject = new CleanClass29();
        int result = subject.process(4);
        assertTrue(result >= 0);
    }
}
