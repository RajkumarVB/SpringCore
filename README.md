# Spring Core - Java Brains

## Understanding Inversion of Control (IoC):

```java
public class OrderService{
    public void processPayment(){
        //Order Logic
        // ...
        //Need to call the payment processor
    }
}
public class PaymentService{
    public void processPayment(){
        //Process payment logic
    }
}
```

```java
public class OrderService{
    private PaymentService paymentService;

    public OrderService(){
        paymentService = new paymentService();
    }

    public void processPayment(){
        paymentService.processPayment();
    }
}
public class PaymentService{
    public void processPayment(){
        //Process payment logic
    }
}
```


#### Traditional Control Flow 
- Objects directly managing their dependencies.
- The problem with the above code is payment service is tightly coupled to order service.
- Say in Test environment you want to use test payment service instead of real/prod payment service you have to do lots of refactoring. 


![](spring-core-slides/2023-10-14-12-20-49.png)

![](spring-core-slides/2023-10-14-13-15-03.png)

![](spring-core-slides/2023-10-14-13-20-46.png)

![](spring-core-slides/2023-10-14-13-22-05.png)


## The problem
```java
public class OrderService{
    private PaymentService paymentService;

    public OrderService(){
        paymentService = new paymentService();
    }

    public void processPayment(){
        paymentService.processPayment();
    }
}
public class PaymentService{
    public void processPayment(){
        //Process payment logic
    }
}
```
## The solution
```java
public class OrderService{
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService; 
    }

    public void processPayment(){
        paymentService.processPayment();
    }
}
public class PaymentService{
    public void processPayment(){
        //Process payment logic
    }
}
```
#### Main class
```java
public class Main{
    public static void main(String[] args){
        PaymentService paymentService = new PaymentService();
        OrderService orderService = new OrderService(paymentService);
    }
}
```

#### Test class
```java
public class TestPaymentService implements PaymentService{
    @Override
    public void processPayment(){
        //Test specific process payment logic
    }
}
public class OrderServiceTest{
    @Test
    public void testProcessPayment(){
        PaymentService paymentService = new TestPaymentService();
        OrderService orderService = new OrderService(paymentService);
        
        //Perform test actions and assertions
        orderService.processPayment();

        //Verify test specific behavior
    }
}
```


![](spring-core-slides/2023-10-14-13-31-47.png)

![](spring-core-slides/2023-10-14-13-32-53.png)

![](spring-core-slides/2023-10-14-13-34-18.png)

![](spring-core-slides/2023-10-14-13-35-26.png)

![](spring-core-slides/2023-10-14-13-35-57.png)


## Understanding the Spring Application

![](spring-core-slides/2023-10-14-15-11-16.png)

![](spring-core-slides/2023-10-14-15-14-19.png)

![](spring-core-slides/2023-10-14-15-14-47.png)

![](spring-core-slides/2023-10-14-15-15-05.png)

![](spring-core-slides/2023-10-14-15-15-18.png)

![](spring-core-slides/2023-10-14-15-16-08.png)

![](spring-core-slides/2023-10-14-15-18-59.png)

![](spring-core-slides/2023-10-14-15-19-39.png)

![](spring-core-slides/2023-10-14-15-20-04.png)

![](spring-core-slides/2023-10-14-15-20-15.png)

![](spring-core-slides/2023-10-14-15-20-56.png)

![](spring-core-slides/2023-10-14-15-21-25.png)


```java
HelloWorldMessage helloWorldMessage1 = new HelloWorldMessage();
HelloWorldMessage helloWorldMessage2 = context.getBean(HelloWorldMessage.class);
```
#### Difference between line 1 and line 2 
- In line 1, you are instantiating a new Object
- In line 2, you are getting the object the spring has already created. 
- The first spring instance is not in Spring context, whereas the second spring instance is in Spring context.


## Dependency Injection
![](spring-core-slides/2023-10-14-16-09-51.png)
![](spring-core-slides/2023-10-14-16-10-12.png)
![](spring-core-slides/2023-10-14-16-10-23.png)
![](spring-core-slides/2023-10-14-16-10-35.png)
![](spring-core-slides/2023-10-14-16-10-44.png)

- For autowire to work, the parameter should be a component. 

<br></br>
![](spring-core-slides/2023-10-14-16-31-15.png)
![](spring-core-slides/2023-10-14-16-31-28.png)
![](spring-core-slides/2023-10-14-16-33-41.png)
![](spring-core-slides/2023-10-14-16-33-54.png)


### Field based DI 
- You should be aware of this, but don't use this. 



![](spring-core-slides/2023-10-14-17-43-20.png)
![](spring-core-slides/2023-10-14-17-44-40.png)
![](spring-core-slides/2023-10-14-17-47-01.png)
![](spring-core-slides/2023-10-14-17-49-02.png)
![](spring-core-slides/2023-10-14-17-49-39.png)
![](spring-core-slides/2023-10-14-18-12-19.png)
![](spring-core-slides/2023-10-14-18-19-14.png)
![](spring-core-slides/2023-10-14-18-19-57.png)
![](spring-core-slides/2023-10-14-18-34-21.png)