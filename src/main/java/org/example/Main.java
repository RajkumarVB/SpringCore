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
    public HelloWorldMessage getHello(String greetMessage){
        return new HelloWorldMessage(greetMessage);
    }

    @Bean
    public Greeter getGreeter(HelloWorldMessage helloWorldMessage){
        return new Greeter(helloWorldMessage);
    }

    @Bean
    public String getGreetMessage(){
        return "How are you? ";
    }
}