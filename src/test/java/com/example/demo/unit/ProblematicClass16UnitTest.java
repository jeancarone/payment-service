package com.example.demo.unit;

import com.example.demo.problematic.ProblematicClass16;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ProblematicClass16UnitTest {

    @Test
    void dangerousOperationReturnsValue() {
        ProblematicClass16 subject = new ProblematicClass16();
        String result = subject.dangerousOperation("unit");
        assertNotNull(result);
    }
}
