package com.pluralsight;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan

public class Main implements CommandLineRunner {

    private final Car car;

    public Main(Car car) {
        this.car = car;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
    @Override
    public void run(String...args) {
        car.drive();
    }
}
