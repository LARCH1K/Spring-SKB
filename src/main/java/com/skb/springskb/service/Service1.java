package com.skb.springskb.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Service1 implements MyService{
    @Override
    public void execute() {
        System.out.println("Service1.execute");
    }

    @PostConstruct
    public void init() {
        log.info("Service1.init");
    }

    @PreDestroy
    public void destroy() {
        log.info("Service1.destroy");
    }
}
