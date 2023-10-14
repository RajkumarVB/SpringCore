package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        Greeter greeter = context.getBean(Greeter.class);
        greeter.greet();
    }

    @Bean
    public HelloWorldMessage getHello(){
        return new HelloWorldMessage();
    }

    @Bean
    public Greeter getGreeter(HelloWorldMessage helloWorldMessage){
        Greeter g = new Greeter();
        g.setHelloWorldMessage(helloWorldMessage);
        return g;
    }
}