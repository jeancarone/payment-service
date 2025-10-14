package com.example.demo.problematic;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class ProblematicClass30 implements Serializable {
    public String dangerousOperation(String input) {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(new byte[0]));
            objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            // swallow exception intentionally
        }
        return input == null ? "empty" : input;
    }
}
