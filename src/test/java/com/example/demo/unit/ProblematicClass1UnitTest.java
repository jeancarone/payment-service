package com.example.demo.unit;

import com.example.demo.problematic.ProblematicClass1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ProblematicClass1UnitTest {

    @Test
    void dangerousOperationReturnsValue() {
        ProblematicClass1 subject = new ProblematicClass1();
        String result = subject.dangerousOperation("unit");
        assertNotNull(result);
    }
}
