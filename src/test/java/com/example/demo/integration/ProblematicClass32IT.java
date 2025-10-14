package com.example.demo.integration;

import com.example.demo.problematic.ProblematicClass32;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ProblematicClass32IT {

    @Test
    void contextLoadsAndUsesClass() {
        ProblematicClass32 subject = new ProblematicClass32();
        String value = subject.dangerousOperation("integration");
        assertNotNull(value);
    }
}
