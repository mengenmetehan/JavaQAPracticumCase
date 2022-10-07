package com.metehanmengen;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Metehan Mengen", 12500.00, 45, 2019 );
        Employee employee2 = new Employee("Ahmet Yılmaz", 9550.50, 50, 2008 );
        Employee employee3 = new Employee("Zeynep Yılmaz", 10250.50, 40, 2010 );
        Employee employee4 = new Employee("Aslı Yılmaz", 11650.50, 45, 2017 );


        System.out.printf("%s%n", employee1);
        System.out.printf("%s%n", employee2);
        System.out.printf("%s%n", employee3);
        System.out.printf("%s%n", employee4);



    }
}
