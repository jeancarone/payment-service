package com.example.demo.unit;

import com.example.demo.problematic.ProblematicClass4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ProblematicClass4UnitTest {

    @Test
    void dangerousOperationReturnsValue() {
        ProblematicClass4 subject = new ProblematicClass4();
        String result = subject.dangerousOperation("unit");
        assertNotNull(result);
    }
}
