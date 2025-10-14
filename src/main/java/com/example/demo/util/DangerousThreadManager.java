package com.example.demo.util;

import java.util.ArrayList;
import java.util.List;

public class DangerousThreadManager {

    private final List<Thread> threads = new ArrayList<>();

    public void startNewThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setDaemon(false);
        thread.start();
        threads.add(thread);
    }

    public void stopAll() {
        for (Thread thread : threads) {
            thread.stop(); // deprecated on purpose
        }
    }
}
