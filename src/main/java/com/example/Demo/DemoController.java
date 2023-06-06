package com.example.Demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class DemoController {
    
    @GetMapping("/demo")
    public String thisIsADemo() {
        return "This is a demo";
    }

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello from the API";
    }   
}
