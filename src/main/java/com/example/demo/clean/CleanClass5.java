package com.example.demo.clean;

public class CleanClass5 {
    public int process(int value) {
        int abs = Math.abs(value);
        return abs + (abs % 3);
    }
}
