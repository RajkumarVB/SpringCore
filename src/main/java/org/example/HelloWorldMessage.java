package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class HelloWorldMessage {

    public String getMessage(){
        return "Hello World, Spring Core!";
    }
}