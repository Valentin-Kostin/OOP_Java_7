package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Master implements Observer {

    private static Random random = new Random();

    private String name;

    private double minSalary;

    private Vakancy myaVakancy;

    public Master(String name) {
        this.name = name;
        minSalary = random.nextDouble(60000, 80000);
        myaVakancy = Vakancy.senior;
    }

    @Override
    public void receiveOffer(String companyName, double salary, Vakancy vakancy) {
        if (minSalary <= salary && myaVakancy == vakancy){
            System.out.printf("Рабочий %s(%s) (%f) >>> Мне нужна эта работа! [%s(%s) - %f]\n",
                    name, myaVakancy, minSalary, companyName, vakancy, salary);
            minSalary = salary;
        }
        else {
            System.out.printf("Рабочий %s(%s) >>> Я найду работу получше (%f)! [%s(%s) - %f]\n",
                    name, myaVakancy, minSalary, companyName, vakancy, salary);
        }
    }
}
