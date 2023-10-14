package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Greeter {
    private HelloWorldMessage helloWorldMessage;

    @Autowired(required = false)
    public Greeter(HelloWorldMessage helloWorldMessage) {
        this.helloWorldMessage = helloWorldMessage;
    }

    public void greet(){
        if(helloWorldMessage != null)
            System.out.println(this.helloWorldMessage.getMessage());
    }
}