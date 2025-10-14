package com.example.demo.integration;

import com.example.demo.clean.CleanClass23;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CleanClass23IT {

    @Test
    void contextLoadsAndProcessesValues() {
        CleanClass23 subject = new CleanClass23();
        int result = subject.process(4);
        assertTrue(result >= 0);
    }
}
