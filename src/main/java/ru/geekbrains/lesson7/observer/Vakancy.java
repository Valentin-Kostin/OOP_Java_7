package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Vakancy {
    private static Random random = new Random();

//    private String name;
    private  double maxSalary;

    public Vakancy() {
        this.maxSalary = random.nextDouble(3000, maxSalary);
//        this.name = name;
    }
}
