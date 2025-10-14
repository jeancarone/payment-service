package com.example.demo.integration;

import com.example.demo.clean.CleanClass28;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CleanClass28IntegrationTest {

    @Test
    void contextLoadsAndProcessesValues() {
        CleanClass28 subject = new CleanClass28();
        int result = subject.process(4);
        assertTrue(result >= 0);
    }
}
