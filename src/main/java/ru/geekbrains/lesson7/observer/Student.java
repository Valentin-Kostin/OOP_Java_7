package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Student implements Observer {

    private static Random random = new Random();
    private String name;

    private double minSalary;

    private Vakancy myaVakancy;

    public Student(String name) {
        this.name = name;
        minSalary = random.nextDouble(2000, 4000);
        myaVakancy = Vakancy.junior;
    }

    @Override
    public void receiveOffer(String companyName, double salary, Vakancy vakancy) {
        if (minSalary <= salary && myaVakancy == vakancy){
            System.out.printf("Студент %s(%s) (%f) >>> Мне нужна эта работа! [%s(%s) - %f]\n",
                    name, myaVakancy, minSalary, companyName, vakancy, salary);
            minSalary = salary;
        }
        else {
            System.out.printf("Студент %s(%s) >>> Я найду работу получше (%f)! [%s(%s) - %f]\n",
                    name, myaVakancy, minSalary, companyName, vakancy, salary);
        }
    }
}
