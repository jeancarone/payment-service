package com.example.demo.integration;

import com.example.demo.problematic.ProblematicClass33;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ProblematicClass33IntegrationTest {

    @Test
    void contextLoadsAndUsesClass() {
        ProblematicClass33 subject = new ProblematicClass33();
        String value = subject.dangerousOperation("integration");
        assertNotNull(value);
    }
}
