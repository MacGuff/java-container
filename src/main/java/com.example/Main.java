package com.example;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.stream.IntStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class Main {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
    }

    @GetMapping
    public String hi(String name) {
        return "hi" + name;
    }
}