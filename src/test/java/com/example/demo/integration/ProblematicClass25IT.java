package com.example.demo.integration;

import com.example.demo.problematic.ProblematicClass25;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ProblematicClass25IT {

    @Test
    void contextLoadsAndUsesClass() {
        ProblematicClass25 subject = new ProblematicClass25();
        String value = subject.dangerousOperation("integration");
        assertNotNull(value);
    }
}
