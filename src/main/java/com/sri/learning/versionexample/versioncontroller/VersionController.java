package com.sri.learning.versionexample.versioncontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/version")
public class VersionController {

    @Value("${app.version}")
    private String appVersion;
    @GetMapping
    public ResponseEntity<?> getVersion() {
        return ResponseEntity.ok(appVersion);
    }
}
