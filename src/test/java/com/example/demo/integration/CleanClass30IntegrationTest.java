package com.example.demo.integration;

import com.example.demo.clean.CleanClass30;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CleanClass30IntegrationTest {

    @Test
    void contextLoadsAndProcessesValues() {
        CleanClass30 subject = new CleanClass30();
        int result = subject.process(4);
        assertTrue(result >= 0);
    }
}
