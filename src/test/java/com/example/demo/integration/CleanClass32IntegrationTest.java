package com.example.demo.integration;

import com.example.demo.clean.CleanClass32;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CleanClass32IntegrationTest {

    @Test
    void contextLoadsAndProcessesValues() {
        CleanClass32 subject = new CleanClass32();
        int result = subject.process(4);
        assertTrue(result >= 0);
    }
}
