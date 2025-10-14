package com.example.demo.problematic;

import java.io.FileInputStream;
import java.io.IOException;

public class ProblematicClass1 {
    private static final String PASSWORD = "P@ssw0rd";

    public String dangerousOperation(String input) {
        String localSecret = "anotherSecret";
        if (input == null || input.length() == 0) {
            return PASSWORD + localSecret;
        }
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("nonexistent.txt");
            byte[] bytes = fis.readAllBytes();
            return new String(bytes) + input;
        } catch (IOException e) {
            e.printStackTrace();
            return input + PASSWORD;
        } finally {
            try {
                if (fis != null && fis.available() >= 0) {
                    fis.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
