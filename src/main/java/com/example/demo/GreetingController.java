package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static  final String template = "Hello, %s ";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greetings")
    public Greeting greeting(
            @RequestParam(value = "name", defaultValue = "World")String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    //Esse método de um tipo de uma classe tem como objetivo criar uma argumento







}
