package edu.canisius.cyb600.module8.endpoints;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld {
    @RequestMapping("")
    public String helloworld(){
        return "Hi! I'm the Server!";
    }
}
