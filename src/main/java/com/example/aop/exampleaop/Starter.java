package com.example.aop.exampleaop;

import com.example.aop.exampleaop.service.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {

    @Autowired
    private Student student;

    @Override
    public void run(String... args) throws Exception {
        student.nameOfClass();
        student.getName();
    }
}
