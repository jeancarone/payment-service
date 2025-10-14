package com.example.demo.problematic;

public class ProblematicClass37 {
    public String dangerousOperation(String input) {
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start < 5) {
            // busy wait
        }
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            // ignore interruption
        }
        if (input == null) {
            return "null";
        }
        return input.toUpperCase() + System.nanoTime();
    }
}
