package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import io.sentry.Sentry;

@RestController
public class IndexAction
{
    @GetMapping("/")
    public ResponseEntity<String> index()
    {
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/sentry")
    public ResponseEntity<String> sentry()
    {
        Sentry.captureMessage("Sentry Message");

        return ResponseEntity.noContent().build();
    }
}
