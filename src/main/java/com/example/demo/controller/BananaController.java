package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.time.Instant;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

@Controller
public class BananaController {

    // 1) Simple health check
    @GetMapping("/banana/ping")
    @ResponseBody
    public String ping() {
        return "pong 🍌";
    }

    // 2) Random payload
    @GetMapping("/banana/random")
    @ResponseBody
    public Map<String, Object> random() {
        return Map.of(
                "id", UUID.randomUUID().toString(),
                "number", ThreadLocalRandom.current().nextInt(1, 101),
                "at", Instant.now().toString()
        );
    }

    // 3) Fetch by path variable (returns 404 for a silly edge case)
    @GetMapping("/banana/{id}")
    public ResponseEntity<Map<String, Object>> byId(@PathVariable String id) {
        if ("0".equals(id)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(Map.of("id", id, "status", "ripe"));
    }

    // 4) Add two numbers via form/query params
    @PostMapping("/banana/sum")
    @ResponseBody
    public Map<String, Integer> sum(@RequestParam int a, @RequestParam int b) {
        return Map.of("a", a, "b", b, "sum", a + b);
    }

    // 5) Echo any JSON you send (plus a timestamp)
    @PostMapping(path = "/banana/echo", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public Map<String, Object> echo(@RequestBody Map<String, Object> body) {
        return Map.of(
                "received", body,
                "receivedAt", Instant.now().toString()
        );
    }

}

