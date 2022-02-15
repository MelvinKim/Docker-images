package com.melvinkimathi.springbootdockerREST.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AboutController {

    @GetMapping("/about")
    public String getAboutPage() {
        return "This is the About Page";
    }
}
