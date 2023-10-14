package org.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class HelloWorldMessage {

    private String greetingMessage;

    @Autowired
    public HelloWorldMessage(String greetingMessage) {
        this.greetingMessage = greetingMessage;
    }

    public String getMessage(){
        return this.greetingMessage + "Spring Core!";
    }
}