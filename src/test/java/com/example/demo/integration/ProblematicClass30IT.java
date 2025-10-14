package com.example.demo.integration;

import com.example.demo.problematic.ProblematicClass30;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ProblematicClass30IT {

    @Test
    void contextLoadsAndUsesClass() {
        ProblematicClass30 subject = new ProblematicClass30();
        String value = subject.dangerousOperation("integration");
        assertNotNull(value);
    }
}
