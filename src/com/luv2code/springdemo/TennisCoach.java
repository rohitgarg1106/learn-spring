package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//bean id = thatSillyCoach
@Component
public class TennisCoach implements Coach {


    @Autowired
    @Qualifier("randomService")
    private FortuneService fortuneService;


    public TennisCoach(){
        System.out.println("I am inside default constructor");
    }

    @PostConstruct
    public void doMyInitStuff(){
        System.out.println(">> TennisCoach: inside of doMyInitStuff");
    }

    //define my destroy method
    @PreDestroy
    public void doMyCleanUpStuff(){
        System.out.println(">> TennisCoach: inside of doMyCleanUpStuff");
    }
    @Override
    public String getDailyWorkout(){
        return "Practice smash for 50 minutes";
    }
    @Override
    public String getDailyFortune(){
        return fortuneService.getDailyFortune();
    }
}
