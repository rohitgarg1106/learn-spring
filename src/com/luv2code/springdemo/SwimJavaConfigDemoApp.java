package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {
        //read spring config file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //get bean from spring container
        SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);
        //call a method on bean
        System.out.println(coach.getDailyWorkout());

        System.out.println(coach.getDailyFortune());
        //close the context
        System.out.println(coach.getEmail());

        System.out.println(coach.getTeam());

        context.close();
    }
}
