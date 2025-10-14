package com.example.demo.integration;

import com.example.demo.problematic.ProblematicClass34;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ProblematicClass34IT {

    @Test
    void contextLoadsAndUsesClass() {
        ProblematicClass34 subject = new ProblematicClass34();
        String value = subject.dangerousOperation("integration");
        assertNotNull(value);
    }
}
