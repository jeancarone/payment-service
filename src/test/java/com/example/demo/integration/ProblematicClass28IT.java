package com.example.demo.integration;

import com.example.demo.problematic.ProblematicClass28;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ProblematicClass28IT {

    @Test
    void contextLoadsAndUsesClass() {
        ProblematicClass28 subject = new ProblematicClass28();
        String value = subject.dangerousOperation("integration");
        assertNotNull(value);
    }
}
