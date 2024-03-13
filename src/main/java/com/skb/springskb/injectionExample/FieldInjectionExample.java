package com.skb.springskb.injectionExample;

import com.skb.springskb.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FieldInjectionExample {

    @Autowired
    @Qualifier("service2")
    private MyService service;

    public void execute() {
        service.execute();
    }

}
