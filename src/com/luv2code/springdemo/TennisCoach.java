package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//bean id = thatSillyCoach
@Component
public class TennisCoach implements Coach {


    @Autowired
    @Qualifier("randomService")
    private FortuneService fortuneService;


    public TennisCoach(){
        System.out.println("I am inside default constructor");
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
