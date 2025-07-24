package org.example;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/discovery")
public class discoveryController {
    @GetMapping("/hello")
    public String hello() {
        return "hello this is the discovery server ";
    }

}
