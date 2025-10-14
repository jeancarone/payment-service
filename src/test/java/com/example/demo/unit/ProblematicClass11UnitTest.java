package com.example.demo.unit;

import com.example.demo.problematic.ProblematicClass11;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ProblematicClass11UnitTest {

    @Test
    void dangerousOperationReturnsValue() {
        ProblematicClass11 subject = new ProblematicClass11();
        String result = subject.dangerousOperation("unit");
        assertNotNull(result);
    }
}
