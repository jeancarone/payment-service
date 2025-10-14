package com.example.demo.unit;

import com.example.demo.problematic.ProblematicClass14;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ProblematicClass14UnitTest {

    @Test
    void dangerousOperationReturnsValue() {
        ProblematicClass14 subject = new ProblematicClass14();
        String result = subject.dangerousOperation("unit");
        assertNotNull(result);
    }
}
