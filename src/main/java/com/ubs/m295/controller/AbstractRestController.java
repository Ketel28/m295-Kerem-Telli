package com.ubs.m295.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AbstractRestController {
    protected static <T> ResponseEntity<T> getRespond(T result) {
        return ResponseEntity.ok(result);
    }

    protected static <T> ResponseEntity<T> postRespond() {
        return ResponseEntity.ok().build();
    }
}
