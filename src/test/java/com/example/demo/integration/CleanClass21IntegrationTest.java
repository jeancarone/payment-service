package com.example.demo.integration;

import com.example.demo.clean.CleanClass21;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CleanClass21IntegrationTest {

    @Test
    void contextLoadsAndProcessesValues() {
        CleanClass21 subject = new CleanClass21();
        int result = subject.process(4);
        assertTrue(result >= 0);
    }
}
