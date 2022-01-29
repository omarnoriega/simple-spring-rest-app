package com.ceiba.springrest.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sayhello {
    @GetMapping("/sayhello")
    public String sayhello() {
        return "Hello, World!";
    }
}