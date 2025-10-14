package com.example.demo.unit;

import com.example.demo.problematic.ProblematicClass3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ProblematicClass3UnitTest {

    @Test
    void dangerousOperationReturnsValue() {
        ProblematicClass3 subject = new ProblematicClass3();
        String result = subject.dangerousOperation("unit");
        assertNotNull(result);
    }
}
