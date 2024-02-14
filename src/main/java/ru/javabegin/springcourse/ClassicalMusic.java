package ru.javabegin.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ClassicalMusic implements  Music {

    @PostConstruct
    public void doMyInit() {
        System.out.println("Do my initialization");
    }

    @PreDestroy
    public void doMeDestroy() {
        System.out.println("Do my destroy");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
