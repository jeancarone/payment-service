package com.example.demo.unit;

import com.example.demo.problematic.ProblematicClass9;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ProblematicClass9UnitTest {

    @Test
    void dangerousOperationReturnsValue() {
        ProblematicClass9 subject = new ProblematicClass9();
        String result = subject.dangerousOperation("unit");
        assertNotNull(result);
    }
}
