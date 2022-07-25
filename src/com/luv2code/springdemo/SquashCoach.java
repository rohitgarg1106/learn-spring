package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

//bean id = thatSillyCoach
@Component
public class SquashCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "Squash court is all yours";
    }
}
