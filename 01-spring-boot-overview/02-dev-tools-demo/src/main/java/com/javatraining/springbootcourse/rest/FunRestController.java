package com.javatraining.springbootcourse.rest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/joke")
    public String tellJoke() {
        return "Knock knock...hehehe";
    }

}
