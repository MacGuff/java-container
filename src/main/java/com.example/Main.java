package com.example;

import java.util.stream.IntStream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class Main {

    public static void main(String[] args) {
        
        SpringApplication.run(Main.class, args);
    }

    @GetMapping
    public  String hi(String name) {
        return "hi" + name;
    }
}