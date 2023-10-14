package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldMessage {
    private HelloWorldMessage helloWorldMessage;

    @Autowired
    public HelloWorldMessage(HelloWorldMessage helloWorldMessage) {
        this.helloWorldMessage = helloWorldMessage;
    }

    public String getMessage(){
        return "Hello World, Spring Core!";
    }
}