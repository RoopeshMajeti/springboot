package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

    @GetMapping
    public String greeting() {
        System.out.println("Hello");
        return "Hellow";
    }


}
