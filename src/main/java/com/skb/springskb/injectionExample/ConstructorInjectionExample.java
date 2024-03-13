package com.skb.springskb.injectionExample;

import com.skb.springskb.service.MyService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectionExample {

    private final MyService myService;

    public ConstructorInjectionExample(@Qualifier("service1")MyService myService) {
        this.myService = myService;
    }

    public void execute() {
        myService.execute();
    }
}
