package com.luv2code.springdemo;

public class SwimCoach implements Coach{

    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){

        return "Swim for 30 minutes";

    }

    @Override
    public String getDailyFortune() {
        return "Just do it" + fortuneService.getFortune();
    }
}
