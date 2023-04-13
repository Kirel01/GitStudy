package com.earth.dayoftheweek;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RemoteController {

    @RequestMapping("/")
    public String earth() {

        System.out.println("Hi SB!");
        return "Hi Spring Boot!";
    }
}
