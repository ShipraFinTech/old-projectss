package com.nexthoughts

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RequestMapping

@SpringBootApplication
class SpringBootDemoApplication {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    static void main(String[] args) {
        SpringApplication.run SpringBootDemoApplication, args
    }
}
