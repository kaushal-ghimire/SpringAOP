package com.example.aop.exampleaop.service;

import org.springframework.stereotype.Component;

@Component
public class Student implements ExampleInterface {


    public String getName(){
        System.out.println("Get name method called");
        return "Kaushal";
    }

    @Override
    public void nameOfClass() {
        System.out.println("Bachelor");
    }
}
