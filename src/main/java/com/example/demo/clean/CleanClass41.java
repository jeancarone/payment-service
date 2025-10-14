package com.example.demo.clean;

import java.util.Optional;

public class CleanClass41 {
    public int process(int value) {
        return Optional.of(value).filter(v -> v > 0).map(v -> v * 2).orElse(0);
    }
}
