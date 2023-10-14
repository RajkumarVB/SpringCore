package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Greeter {
    private HelloWorldMessage helloWorldMessage;

    public Greeter() {
    }

    @Autowired
    public void setHelloWorldMessage(HelloWorldMessage helloWorldMessage) {
        System.out.println("Setter called");
        this.helloWorldMessage = helloWorldMessage;
    }

    public void greet(){
        System.out.println(this.helloWorldMessage.getMessage());
    }
}