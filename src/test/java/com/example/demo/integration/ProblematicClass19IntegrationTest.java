package com.example.demo.integration;

import com.example.demo.problematic.ProblematicClass19;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ProblematicClass19IntegrationTest {

    @Test
    void contextLoadsAndUsesClass() {
        ProblematicClass19 subject = new ProblematicClass19();
        String value = subject.dangerousOperation("integration");
        assertNotNull(value);
    }
}
