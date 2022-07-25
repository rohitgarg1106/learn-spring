package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
        //read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //get bean from spring container
        Coach coach = context.getBean("squashCoach", Coach.class);
        //call a method on bean
        System.out.println(coach.getDailyWorkout());
        //close the context
        context.close();
    }
}
