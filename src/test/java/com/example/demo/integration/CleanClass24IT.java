package com.example.demo.integration;

import com.example.demo.clean.CleanClass24;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CleanClass24IT {

    @Test
    void contextLoadsAndProcessesValues() {
        CleanClass24 subject = new CleanClass24();
        int result = subject.process(4);
        assertTrue(result >= 0);
    }
}
