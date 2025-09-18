package com.rajendra.githubActionDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gitInfo")
public class GitHudActionClass {
    @GetMapping("/welcome")
    public String getMessage(){
        return "Welcome to Github Actions Demo";
    }
}
