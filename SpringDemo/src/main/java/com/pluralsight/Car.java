package com.pluralsight;

import org.springframework.stereotype.Component;

@Component

public class Car {
    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
    public void drive() {
        System.out.println(engine.start() + " Car is driving...");
    }
}
