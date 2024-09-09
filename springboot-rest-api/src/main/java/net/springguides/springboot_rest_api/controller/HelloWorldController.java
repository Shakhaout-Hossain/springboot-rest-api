package net.springguides.springboot_rest_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    ///Http Get Request
    /// http://localhost:8080/hello-world

    @GetMapping("/hello-world")

    public String helloWorld(){
        return "HedlloWorld";
    }
}
