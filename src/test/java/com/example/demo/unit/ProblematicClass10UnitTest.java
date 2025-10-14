package com.example.demo.unit;

import com.example.demo.problematic.ProblematicClass10;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ProblematicClass10UnitTest {

    @Test
    void dangerousOperationReturnsValue() {
        ProblematicClass10 subject = new ProblematicClass10();
        String result = subject.dangerousOperation("unit");
        assertNotNull(result);
    }
}
