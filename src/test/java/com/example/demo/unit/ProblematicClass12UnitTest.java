package com.example.demo.unit;

import com.example.demo.problematic.ProblematicClass12;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ProblematicClass12UnitTest {

    @Test
    void dangerousOperationReturnsValue() {
        ProblematicClass12 subject = new ProblematicClass12();
        String result = subject.dangerousOperation("unit");
        assertNotNull(result);
    }
}
