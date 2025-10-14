package com.example.demo.integration;

import com.example.demo.clean.CleanClass33;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CleanClass33IT {

    @Test
    void contextLoadsAndProcessesValues() {
        CleanClass33 subject = new CleanClass33();
        int result = subject.process(4);
        assertTrue(result >= 0);
    }
}
