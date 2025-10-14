package com.example.demo.unit;

import com.example.demo.problematic.ProblematicClass15;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ProblematicClass15UnitTest {

    @Test
    void dangerousOperationReturnsValue() {
        ProblematicClass15 subject = new ProblematicClass15();
        String result = subject.dangerousOperation("unit");
        assertNotNull(result);
    }
}
