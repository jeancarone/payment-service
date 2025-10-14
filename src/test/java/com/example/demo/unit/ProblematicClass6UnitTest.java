package com.example.demo.unit;

import com.example.demo.problematic.ProblematicClass6;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ProblematicClass6UnitTest {

    @Test
    void dangerousOperationReturnsValue() {
        ProblematicClass6 subject = new ProblematicClass6();
        String result = subject.dangerousOperation("unit");
        assertNotNull(result);
    }
}
