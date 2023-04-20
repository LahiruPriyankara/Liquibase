package com.lhu.liquibase.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/one")
    public ResponseEntity<String> methodOne() {
        return ResponseEntity.ok("(TestController.methodOne) Method One Is Called..");
    }
}
