package com.company;

import java.io.InputStream;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        InputStream input = System.in;
        Scanner readInput = new Scanner(input);

//        print welcome message
        System.out.println("Welcome to the magic year calculator!");
//        get users first name
        System.out.println("Please input your name: ");
        String firstName = readInput.nextLine();

//        get users surname
        System.out.println("Please input your surname: ");
        String surname = readInput.nextLine();

//        get users annual salary
        System.out.println("Please input your annual salary: ");
        int annualSalary = Integer.parseInt(readInput.nextLine());

//        get users start year
        System.out.println("Please enter your work start year: ");
        int workYear = Integer.parseInt(readInput.nextLine());

//        create class to return full name
//        create new person (the Person class is useless without this step)
        Person person1 = new Person(firstName, surname);

//        create class to return monthly salary
//        create class to return magic year

//        print magic details message
        System.out.println("Your magic details are: ");
//        print full name
        System.out.println("Name: " + person1.fullName(firstName, surname));
        System.out.println("Monthly salary: " + monthlySalary(annualSalary));
        System.out.println("Magic year : " + magicYear(workYear));

    }

    //        print monthly salary in a method
    public static int monthlySalary(int annualSalary) {
        return annualSalary / 12;

    }

    //        print magic year
    public static int magicYear(int workYear){
        return workYear + 65;
    }
}



////        Welcome to the magic year calculator!
////
////        Please input your name: John
////        Please input your surname: Doe
////        Please enter your annual salary: 60050
////        Please enter your work start year : 1980
////
////        Your magic age details are:
////
////        Name: John Doe
////        Monthly Salary: 5004
////        Magic Year: 2045