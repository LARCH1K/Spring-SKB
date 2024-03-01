package com.skb.springskb.injectionExample;

import com.skb.springskb.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterInjectionExample {

    private MyService service1;

    @Autowired
    public void setService1(MyService service1) {
        this.service1 = service1;
    }

    public void execute() {
        service1.execute();
    }
}
