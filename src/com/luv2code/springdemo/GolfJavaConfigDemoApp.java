package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GolfJavaConfigDemoApp {
    public static void main(String[] args) {
        //read spring config file

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //get bean from spring container
        GolfCoach coach = context.getBean("golfCoach", GolfCoach.class);
        //call a method on bean
        System.out.println(coach.getDailyWorkout());

        System.out.println(coach.getDailyFortune());
        //close the context
        System.out.println(coach.getBrand());

        System.out.println(coach.getCourse());

        context.close();
    }
}
