package com.codegym.lesson03.lession_03_exercises;

import java.util.Scanner;

public class exercise3 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int size;
        while (true) {
            System.out.print("Enter the amount of money billionaires want to compare: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("cant do with the size over 20!");
                continue;
            }
            break;
        }

        double[] money = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element: ");
            money[i] = sc.nextDouble();
        }


        double max = money[0];    
        int id = 0;                 
        for (int i = 1; i < money.length; i++) {   
            if (max < money[i]) {
                max = money[i];
                id = i;
            }
        }
          System.out.printf("The largest property value in the list is %.2f at position %d%n",
                  max, id + 1);
        
        
    }
}


