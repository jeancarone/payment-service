package com.example.demo.integration;

import com.example.demo.problematic.ProblematicClass29;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ProblematicClass29IT {

    @Test
    void contextLoadsAndUsesClass() {
        ProblematicClass29 subject = new ProblematicClass29();
        String value = subject.dangerousOperation("integration");
        assertNotNull(value);
    }
}
