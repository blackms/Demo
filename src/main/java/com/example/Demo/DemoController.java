package com.example.Demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class DemoController {
    
    @GetMapping("/demo")
    public String thisIsADemo() {
        return "This is a demo";
    }

    @GetMapping(value="/sayBye", produces = "application/json")
    public String hello() {
        return "{\"message\":\"Bye from the API\"}";
    }

    @GetMapping(value="/sayHello", produces = "application/json")
    public String hello2() {
        return "{\"message\":\"Hello from the API\"}";
    }
}
