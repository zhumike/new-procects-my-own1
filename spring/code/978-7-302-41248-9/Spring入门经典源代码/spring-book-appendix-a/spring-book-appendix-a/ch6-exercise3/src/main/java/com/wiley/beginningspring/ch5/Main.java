package com.wiley.beginningspring.ch5;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    
    public static void main(String[] args) {
    	AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Ch5Configuration.class);
        EntityManagerFactory entityManagerFactory = applicationContext.getBean(EntityManagerFactory.class);
        System.out.println(entityManagerFactory.isOpen());
    }
}
