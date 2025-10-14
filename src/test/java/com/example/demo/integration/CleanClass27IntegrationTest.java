package com.example.demo.integration;

import com.example.demo.clean.CleanClass27;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CleanClass27IntegrationTest {

    @Test
    void contextLoadsAndProcessesValues() {
        CleanClass27 subject = new CleanClass27();
        int result = subject.process(4);
        assertTrue(result >= 0);
    }
}
