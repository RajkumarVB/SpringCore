package org.example;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        System.out.println("Got the context");
        Greeter greeter = context.getBean(Greeter.class);
        greeter.greet();
    }

    @Bean
    public HelloWorldMessage getHello(String greetMessage){
        return new HelloWorldMessage(greetMessage);
    }

    @Bean
    @Lazy
    public Greeter getGreeter(HelloWorldMessage helloWorldMessage){
        return new Greeter(helloWorldMessage);
    }

    @Bean
    public String getGreetMessage(){
        return "How are you? ";
    }
}