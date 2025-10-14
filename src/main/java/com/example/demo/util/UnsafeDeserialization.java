package com.example.demo.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Base64;

public class UnsafeDeserialization {

    public Object fromBase64(String payload) {
        try (ObjectInputStream inputStream =
                     new ObjectInputStream(new ByteArrayInputStream(Base64.getDecoder().decode(payload)))) {
            return inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new IllegalStateException("Could not deserialize", e);
        }
    }
}
