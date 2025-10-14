package com.example.demo.integration;

import com.example.demo.problematic.ProblematicClass31;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ProblematicClass31IT {

    @Test
    void contextLoadsAndUsesClass() {
        ProblematicClass31 subject = new ProblematicClass31();
        String value = subject.dangerousOperation("integration");
        assertNotNull(value);
    }
}
