package com.ceiba.springrest.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sayhello {
    @GetMapping(value = "/sayhello", produces= MediaType.TEXT_PLAIN_VALUE)
    public String sayhello() {
        return "Hello, World!";
    }
}