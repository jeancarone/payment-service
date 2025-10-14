package com.example.demo.clean;

public class CleanClass8 {
    public int process(int value) {
        switch (value) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return value * value;
        }
    }
}
