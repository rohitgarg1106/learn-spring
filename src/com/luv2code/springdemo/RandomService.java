package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomService implements FortuneService{
    String[] fortuneList = {
            "You have a secret admirer",
            "Look how far you've come",
            "Be careful who you trust"
    };

private Random random = new Random();
    @Override
    public String getDailyFortune() {
        int rnd = random.nextInt(fortuneList.length);
        return fortuneList[rnd];
    }
}
