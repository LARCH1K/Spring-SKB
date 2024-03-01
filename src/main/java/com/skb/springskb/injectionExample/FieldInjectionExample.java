package com.skb.springskb.injectionExample;

import com.skb.springskb.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FieldInjectionExample {

    @Autowired
    private MyService service2;

    public void execute() {
        service2.execute();
    }

}
