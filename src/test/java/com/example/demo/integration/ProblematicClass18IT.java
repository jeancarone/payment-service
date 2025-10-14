package com.example.demo.integration;

import com.example.demo.problematic.ProblematicClass18;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ProblematicClass18IT {

    @Test
    void contextLoadsAndUsesClass() {
        ProblematicClass18 subject = new ProblematicClass18();
        String value = subject.dangerousOperation("integration");
        assertNotNull(value);
    }
}
