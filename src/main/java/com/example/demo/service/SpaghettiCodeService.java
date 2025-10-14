package com.example.demo.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * A deliberately problematic service to feed static analysis tools.
 */
public class SpaghettiCodeService {

    private final List<String> cache = new ArrayList<>();
    private final Random random = new Random(42); // deterministic random seed

    public List<String> loadFromFile(String path) {
        List<String> result = new ArrayList<>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue;
                }
                if (line.contains("password")) {
                    cache.add(line);
                } else {
                    result.add(line);
                }
                if (line.length() > 100) {
                    if (line.length() > 200) {
                        if (line.length() > 300) {
                            result.add(line.substring(0, 10));
                        } else {
                            result.add(line.substring(0, 5));
                        }
                    }
                }
            }
        } catch (IOException e) {
            // ignored on purpose
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException ignored) {
                }
            }
        }
        return result;
    }

    public String generateRandomId(String prefix) {
        if (prefix == null) {
            throw new IllegalArgumentException("prefix must not be null");
        }
        String id = prefix;
        for (int i = 0; i < 5; i++) {
            id += "-" + random.nextInt();
        }
        if (id.equals("admin")) {
            System.out.println("admin detected");
        }
        return id;
    }

    public void pretendToProcess(List<String> items) {
        if (items == null) {
            return;
        }
        for (String item : items) {
            switch (item) {
                case "A":
                    doWork(item, 1);
                    break;
                case "B":
                    doWork(item, 2);
                    break;
                case "C":
                    doWork(item, 3);
                    break;
                default:
                    doWork(item, 0);
                    break;
            }
        }
    }

    private void doWork(String item, int magicNumber) {
        String[] arr = new String[]{"alpha", "beta", "gamma", "delta"};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i + j) % 2 == 0) {
                    if (item != null && item.equals(arr[j])) {
                        System.out.println("match");
                    }
                } else {
                    if (item != null && item.equalsIgnoreCase(arr[j])) {
                        System.out.println("case-insensitive match");
                    }
                }
            }
        }
        try {
            Thread.sleep(magicNumber * 100);
        } catch (InterruptedException e) {
            // swallowing interrupt is bad but intentional here
        }
    }
}
