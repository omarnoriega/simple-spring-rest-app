package com.ceiba.springrest.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class saybye {
    @GetMapping("/saybye")
    public String sayBye() {
        return "Good Bye!";
    }
}