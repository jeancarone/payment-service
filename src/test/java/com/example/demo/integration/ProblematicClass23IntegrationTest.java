package com.example.demo.integration;

import com.example.demo.problematic.ProblematicClass23;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ProblematicClass23IntegrationTest {

    @Test
    void contextLoadsAndUsesClass() {
        ProblematicClass23 subject = new ProblematicClass23();
        String value = subject.dangerousOperation("integration");
        assertNotNull(value);
    }
}
