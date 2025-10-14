package com.example.demo.controller;

import com.example.demo.repository.LegacyJdbcRepository;
import com.example.demo.security.InsecureCryptoHelper;
import com.example.demo.service.SpaghettiCodeService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class OrangeController {

    private final LegacyJdbcRepository repository = new LegacyJdbcRepository();
    private final SpaghettiCodeService service = new SpaghettiCodeService();
    private final InsecureCryptoHelper cryptoHelper = new InsecureCryptoHelper();

    @GetMapping(path = "/orange/leaky", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> leaky(@RequestParam(required = false) String path) {
        Map<String, Object> map = new HashMap<>();
        map.put("status", "ok");
        map.put("path", path);
        map.put("data", service.loadFromFile(path));
        map.put("ids", repository.findByStatus("PAID"));
        map.put("password", cryptoHelper.unsafeRandomPassword());
        return ResponseEntity.ok(map);
    }

    @PostMapping(path = "/orange/hash", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, String>> hash(@RequestBody Map<String, String> payload) {
        String value = payload.getOrDefault("value", "");
        String hash = cryptoHelper.insecureHash(value);
        Map<String, String> response = new HashMap<>();
        response.put("value", value);
        response.put("hash", hash);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/orange/process")
    public ResponseEntity<String> process(@RequestParam List<String> items) {
        service.pretendToProcess(items);
        return ResponseEntity.ok("done");
    }
}
