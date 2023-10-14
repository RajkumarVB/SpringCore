package org.example;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldMessage {
    public String getMessage(){
        return "Hello World, Spring Core!";
    }
}
