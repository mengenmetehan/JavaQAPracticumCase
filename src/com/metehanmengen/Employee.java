package com.metehanmengen;

public class Employee {
    private final String name;
    private final double salary;
    private final int workHours;
    private final int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    private double tax()
    {
        double taxAmount = 0;

        if (salary > 1000)
            taxAmount += salary * 0.03;

        return taxAmount;
    }

    private int bonus()
    {
        int extraWorkHours = workHours <= 40 ? 0 : workHours - 40;

        return extraWorkHours * 30;
    }

    private double raiseSalary()
    {
        int getYear = 2021;  //LocalDate.now().getYear() ile yılı güncel tutabiliriz.


        int numberOfYearsWorked = getYear - hireYear;

        double increment;

        if (numberOfYearsWorked < 10)
            increment = (salary + bonus() - tax()) * 0.05;
        else if (numberOfYearsWorked < 20)
            increment = (salary + bonus() - tax()) * 0.1;
        else
            increment = (salary + bonus() - tax()) * 0.15;

        return increment;
    }


    @Override
    public String toString() {
        return String.format("%s %d yılında işe girdi. Güncel maaşı %.02f dir", this.name, this.hireYear, this.salary + this.bonus() - this.tax() + this.raiseSalary());
    }
}
