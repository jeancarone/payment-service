package com.example.demo.integration;

import com.example.demo.problematic.ProblematicClass22;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ProblematicClass22IT {

    @Test
    void contextLoadsAndUsesClass() {
        ProblematicClass22 subject = new ProblematicClass22();
        String value = subject.dangerousOperation("integration");
        assertNotNull(value);
    }
}
