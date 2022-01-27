package com.example.aop.exampleaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Aspect
public class StudentLoggingAspects {

    @Before("execution(public String getName())")
    public String getName(JoinPoint joinPoint){
        System.out.println("Get name method called");
        return "Kaushal";
    }

    @Pointcut("within(com.example..aop.exapleaop.service.*)")
    public void allMethodPointCut(){
    }

    @Before("execution(* com.example.aop.exampleaop.service.Student.*())")
    public void serviceMethodExecution(JoinPoint joinPoint){
        String targetClass = joinPoint.getTarget().getClass().getSimpleName();
        String targetMethod = joinPoint.getSignature().getName();
        System.out.println(targetClass + " - " + targetMethod +" " + "method called at" + " "+ new Date());
    }
    @After("execution(* com.example.aop.exampleaop.service.Student.*())")
    public void serviceAfterMethodExecution(JoinPoint joinPoint){
        String targetClass = joinPoint.getTarget().getClass().getSimpleName();
        String targetMethod = joinPoint.getSignature().getName();
        System.out.println(targetClass + " - " + targetMethod +" " + "method called at" + " "+ new Date());
    }
}
