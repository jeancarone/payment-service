package com.example.demo.integration;

import com.example.demo.clean.CleanClass31;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CleanClass31IntegrationTest {

    @Test
    void contextLoadsAndProcessesValues() {
        CleanClass31 subject = new CleanClass31();
        int result = subject.process(4);
        assertTrue(result >= 0);
    }
}
