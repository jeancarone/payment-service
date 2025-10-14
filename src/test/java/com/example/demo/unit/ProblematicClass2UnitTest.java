package com.example.demo.unit;

import com.example.demo.problematic.ProblematicClass2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ProblematicClass2UnitTest {

    @Test
    void dangerousOperationReturnsValue() {
        ProblematicClass2 subject = new ProblematicClass2();
        String result = subject.dangerousOperation("unit");
        assertNotNull(result);
    }
}
