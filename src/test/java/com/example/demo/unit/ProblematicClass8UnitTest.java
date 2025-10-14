package com.example.demo.unit;

import com.example.demo.problematic.ProblematicClass8;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ProblematicClass8UnitTest {

    @Test
    void dangerousOperationReturnsValue() {
        ProblematicClass8 subject = new ProblematicClass8();
        String result = subject.dangerousOperation("unit");
        assertNotNull(result);
    }
}
