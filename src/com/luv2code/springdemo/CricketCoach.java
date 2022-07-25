package com.luv2code.springdemo;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    public CricketCoach(){
        System.out.println("CricketCoach: inside no-args constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside fortune service setter");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Practice fast bowling for 15 mins";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
