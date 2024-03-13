package com.skb.springskb.injectionExample;

import com.skb.springskb.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SetterInjectionExample {

    private MyService service;

    @Autowired
    public void setService(@Qualifier("service1") MyService service) {
        this.service = service;
    }

    public void execute() {
        service.execute();
    }
}
