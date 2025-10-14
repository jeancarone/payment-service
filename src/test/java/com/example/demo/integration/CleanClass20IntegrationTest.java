package com.example.demo.integration;

import com.example.demo.clean.CleanClass20;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CleanClass20IntegrationTest {

    @Test
    void contextLoadsAndProcessesValues() {
        CleanClass20 subject = new CleanClass20();
        int result = subject.process(4);
        assertTrue(result >= 0);
    }
}
