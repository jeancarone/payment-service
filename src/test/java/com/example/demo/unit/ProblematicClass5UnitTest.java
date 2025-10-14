package com.example.demo.unit;

import com.example.demo.problematic.ProblematicClass5;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ProblematicClass5UnitTest {

    @Test
    void dangerousOperationReturnsValue() {
        ProblematicClass5 subject = new ProblematicClass5();
        String result = subject.dangerousOperation("unit");
        assertNotNull(result);
    }
}
