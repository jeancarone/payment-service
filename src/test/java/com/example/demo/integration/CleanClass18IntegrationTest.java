package com.example.demo.integration;

import com.example.demo.clean.CleanClass18;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CleanClass18IntegrationTest {

    @Test
    void contextLoadsAndProcessesValues() {
        CleanClass18 subject = new CleanClass18();
        int result = subject.process(4);
        assertTrue(result >= 0);
    }
}
