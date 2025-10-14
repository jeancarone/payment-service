package com.example.demo.integration;

import com.example.demo.problematic.ProblematicClass21;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ProblematicClass21IntegrationTest {

    @Test
    void contextLoadsAndUsesClass() {
        ProblematicClass21 subject = new ProblematicClass21();
        String value = subject.dangerousOperation("integration");
        assertNotNull(value);
    }
}
