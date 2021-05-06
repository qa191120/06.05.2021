package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name)
    {
        return String.format("<h1 style=\"color:red\">Hello %s!</h1><h2>smaller</h2>", name);
    }
    @GetMapping("/add")
    public String add(@RequestParam(value = "a", defaultValue = "0") Integer a,
                      @RequestParam(value = "b", defaultValue = "0") Integer b)
    {
        return String.format("%d + %d = %d",a, b, a+b);
    }
    @GetMapping("/customer")
    public String getCustomer()
    {
        return String.format("[ { id : 1, name : 'danny' }, { id: 2, name: 'sharon' } ]");
    }
    @PostMapping("/customer")
    public String addCustomer()
    {
        return String.format("[ { id : 1, name : 'danny' }, { id: 2, name: 'sharon' } ]");
    }


    //@PutMapping
    //@DeleteMapping
    // exercise:
    // 1. multiply
    // 2. div -- when b is 0 then print error (in red)
}
