package ru.vnevzorov.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        test();

        SpringApplication.run(DemoApplication.class, args);
    }

    private static void test() {
        System.out.println("Hello, World!");
    }

}
