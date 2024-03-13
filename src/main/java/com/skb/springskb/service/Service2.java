package com.skb.springskb.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Service2 implements MyService{
    @Override
    public void execute() {
        log.info("Service2.execute");
    }

    @PostConstruct
    public void init() {
        log.info("Service2.init");
    }

    @PreDestroy
    public void destroy() {
         log.info("Service2.destroy");
    }
}
