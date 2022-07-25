package com.luv2code.springdemo;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;
    private String name;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("CricketCoach: inside name setter: " + name);
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        System.out.println("CricketCoach: inside salary setter: " + salary);
        this.salary = salary;
    }

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
