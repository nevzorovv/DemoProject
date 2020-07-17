package ru.vnevzorov.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        test();
        sayMyName();
        sayHowOldAreU();
        SpringApplication.run(DemoApplication.class, args);
    }

    private static void test() {
        System.out.println("Hello, World!");
    }

    private static void sayMyName() {
        System.out.println("I'm a demo project");
    }

    private static void sayHowOldAreU() {
        System.out.println("How Old Are U");
    }

}
