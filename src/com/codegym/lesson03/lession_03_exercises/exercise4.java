package com.codegym.lesson03.lession_03_exercises;

import java.util.Scanner;

public class exercise4 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        while (true) {
            System.out.println();
        System.out.println("-----Function button-----");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        System.out.print("Please select the function you want to execute: ");
            choice = sc.nextInt();
        if (choice < 0 || choice > 2) {
            System.out.println("The function you requested does not exist. Please try again!");
            continue;
        }
        break;
        }
        switch (choice) {
            case 1:
                System.out.print("Let me know the Fahrenheit: ");
                double fahrenheit = sc.nextDouble();
                double result = 5.0/9.0 * (fahrenheit - 32);
                System.out.print("Celsius = " + result + "°C");
                break;

             case 2:
                System.out.print("Let me know the celsius: ");
                double celsius = sc.nextDouble();
                double result2 = celsius * 9.0/5.0 + 32.0;
                System.out.print("Fahrenheit = " + result2 + "°F");
                break;
            case 0:
            System.exit(0);
            break;
        
            default: 
            System.out.println("Function doesn't exist!");
                break;
        }

    }
}
