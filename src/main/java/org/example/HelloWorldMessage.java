package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldMessage {
    private HelloWorldMessage helloWorldMessage;
    public String getMessage(){

        return "Hello World, Spring Core!";
    }
    @Autowired
    public void setHelloWorldMessage(HelloWorldMessage helloWorldMessage) {
        this.helloWorldMessage = helloWorldMessage;
    }
}
