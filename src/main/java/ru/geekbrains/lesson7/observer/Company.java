package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Company {

    private static  Random random = new Random();
    private String companyName;
    private  double maxSalary;
    // private Vakancy vakancy;
    private Publisher jobAgency;


    public Company(String companyName, double maxSalary, Publisher jobAgency) {
        this.companyName = companyName;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
        // this.vakancy = vakancy;
    }

    public void needEmployee(Vakancy vakancy){
        double salary = random.nextDouble(3000, maxSalary);
        jobAgency.sendOffer(companyName, salary, vakancy);
    }


}
