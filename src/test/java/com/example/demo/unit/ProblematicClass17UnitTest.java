package com.example.demo.unit;

import com.example.demo.problematic.ProblematicClass17;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ProblematicClass17UnitTest {

    @Test
    void dangerousOperationReturnsValue() {
        ProblematicClass17 subject = new ProblematicClass17();
        String result = subject.dangerousOperation("unit");
        assertNotNull(result);
    }
}
