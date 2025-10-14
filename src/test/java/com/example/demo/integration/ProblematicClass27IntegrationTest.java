package com.example.demo.integration;

import com.example.demo.problematic.ProblematicClass27;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ProblematicClass27IntegrationTest {

    @Test
    void contextLoadsAndUsesClass() {
        ProblematicClass27 subject = new ProblematicClass27();
        String value = subject.dangerousOperation("integration");
        assertNotNull(value);
    }
}
