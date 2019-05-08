package com.wiley.beginningspring.ch8.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * User: mertcaliskan
 * Date: 25/06/14
 */
@Component
@Aspect
@Order(150)
public class ExecutionOrderAfter {

    @After(value = "execution(public * *(..))")
    public void after(JoinPoint joinPoint) {
        System.out.println("===5. After Advice.");
    }
}
