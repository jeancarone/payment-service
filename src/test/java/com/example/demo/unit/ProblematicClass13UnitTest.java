package com.example.demo.unit;

import com.example.demo.problematic.ProblematicClass13;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ProblematicClass13UnitTest {

    @Test
    void dangerousOperationReturnsValue() {
        ProblematicClass13 subject = new ProblematicClass13();
        String result = subject.dangerousOperation("unit");
        assertNotNull(result);
    }
}
