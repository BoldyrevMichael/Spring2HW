package ru.boldyrev.ma.spring2.hw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HwApplication {

    public static void main(String[] args) {
        SpringApplication.run(HwApplication.class, args);
    }

    @RequestMapping("/**")
    public String helloWorld() {
        return "Hello World";
    }
}