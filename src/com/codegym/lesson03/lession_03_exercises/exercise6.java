package com.codegym.lesson03.lession_03_exercises;

import java.util.Scanner;

public class exercise6 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = 7;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("array[" + i + "] = ");
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the element need to delete: ");
        int x = sc.nextInt();

        int newSize = n; 
        for (int i = 0; i < newSize; i++) {
            if (array[i] == x) {
                for (int j = i; j < newSize - 1; j++) {
                    array[j] = array[j + 1];
                }
                newSize--;   
                i--;        
            }
        }

        
        System.out.print("Array after delete: ");
        for (int i = 0; i < newSize; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

