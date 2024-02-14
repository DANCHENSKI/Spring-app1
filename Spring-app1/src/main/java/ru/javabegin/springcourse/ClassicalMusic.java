package ru.javabegin.springcourse;

import org.springframework.stereotype.Component;

@Component("classicalMusic")
public class ClassicalMusic implements  Music {
    private ClassicalMusic() {}
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
