package com.example.demo.unit;

import com.example.demo.problematic.ProblematicClass7;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ProblematicClass7UnitTest {

    @Test
    void dangerousOperationReturnsValue() {
        ProblematicClass7 subject = new ProblematicClass7();
        String result = subject.dangerousOperation("unit");
        assertNotNull(result);
    }
}
