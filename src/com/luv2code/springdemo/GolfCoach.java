package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class GolfCoach implements Coach{

    private FortuneService fortuneService;

    @Value("${foo.course}")
    private String course;

    @Value("${foo.brand}")
    private String brand;

    public String getCourse() {
        return course;
    }

    public String getBrand() {
        return brand;
    }

    public GolfCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Hit 100 balls on range daily";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }
}
