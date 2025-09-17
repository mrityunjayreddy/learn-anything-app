package com.project.backend.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthcheck/test")
public class TestController {


    @GetMapping("/string")
    public ResponseEntity getTestString(){
        return ResponseEntity.ok("This is a test string");
    }

    @GetMapping("/actor")
    public ResponseEntity getAllActors(){
        return  ResponseEntity.ok("This is a test controller");
    }
}
