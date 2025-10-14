package com.example.demo.clean;

public class CleanClass27 {
    public int process(int value) {
        if (value < 0) {
            return 0;
        }
        int result = 1;
        for (int i = 0; i < value; i++) {
            result += i;
        }
        return result;
    }
}
