package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Greeter {
    private HelloWorldMessage helloWorldMessage;

    @Autowired
    public Greeter(HelloWorldMessage helloWorldMessage) {
        System.out.println("In greeter constructor");
        this.helloWorldMessage = helloWorldMessage;
    }

    public void greet(){
        System.out.println(this.helloWorldMessage.getMessage());
    }
}