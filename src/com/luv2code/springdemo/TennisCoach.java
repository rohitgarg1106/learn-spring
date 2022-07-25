package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//bean id = thatSillyCoach
@Component
public class TennisCoach implements Coach {


    private FortuneService fortuneService;


    public TennisCoach(){

    }

    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Autowired
    public void doSomeCrazyStuff(FortuneService fortuneService){
        System.out.println("I am inside crazy stuff\n");
        this.fortuneService = fortuneService;
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
