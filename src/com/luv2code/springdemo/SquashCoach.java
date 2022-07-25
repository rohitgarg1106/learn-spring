package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//bean id = thatSillyCoach
@Component
public class SquashCoach implements Coach {


    private FortuneService fortuneService;

    @Autowired
    public SquashCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Squash court is all yours";
    }

    @Override
    public String getDailyFortune(){
        return fortuneService.getDailyFortune();
    }
}
