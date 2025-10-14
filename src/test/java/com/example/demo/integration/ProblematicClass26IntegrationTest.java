package com.example.demo.integration;

import com.example.demo.problematic.ProblematicClass26;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ProblematicClass26IntegrationTest {

    @Test
    void contextLoadsAndUsesClass() {
        ProblematicClass26 subject = new ProblematicClass26();
        String value = subject.dangerousOperation("integration");
        assertNotNull(value);
    }
}
