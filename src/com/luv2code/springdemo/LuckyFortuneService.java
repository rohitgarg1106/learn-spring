package com.luv2code.springdemo;

public class LuckyFortuneService implements FortuneService{

    @Override
    public String getDailyFortune() {
        return "Congrats! You won a world tour!";
    }
}
