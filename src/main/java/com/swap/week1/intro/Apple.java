package com.swap.week1.intro;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

public class Apple {

    void eatApple(){
        System.out.println("apples");
    }

    @PostConstruct
    void callBeforeApple(){
        System.out.println("before use");
    }

    @PreDestroy
    void callBeforeDestroy(){
        System.out.println("destroying");
    }
}
