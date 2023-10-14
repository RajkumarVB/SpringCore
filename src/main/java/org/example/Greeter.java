package org.example;

import org.springframework.stereotype.Component;

@Component
public class Greeter {
    private HelloWorldMessage helloWorldMessage;

    public Greeter() {
        this.helloWorldMessage = new HelloWorldMessage();
    }

    public void greet(){
        System.out.println(this.helloWorldMessage.getMessage());
    }
}
