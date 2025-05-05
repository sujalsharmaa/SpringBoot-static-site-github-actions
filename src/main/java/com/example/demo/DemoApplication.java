package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "index.html";
    }

    @GetMapping("/about")
    public String about() {
        return "about_us.html";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact_us.html";
    }

    @GetMapping("/blog1")
    public String blog1() {
        return "blog1.html";
    }
}
