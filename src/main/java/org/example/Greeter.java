package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Greeter {
    @Autowired
    private HelloWorldMessage helloWorldMessage;

    public void greet(){
        System.out.println(this.helloWorldMessage.getMessage());
    }
}