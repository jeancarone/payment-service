package com.example.demo.integration;

import com.example.demo.problematic.ProblematicClass20;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ProblematicClass20IT {

    @Test
    void contextLoadsAndUsesClass() {
        ProblematicClass20 subject = new ProblematicClass20();
        String value = subject.dangerousOperation("integration");
        assertNotNull(value);
    }
}
