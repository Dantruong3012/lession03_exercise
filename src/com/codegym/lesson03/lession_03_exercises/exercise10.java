package com.codegym.lesson03.lession_03_exercises;

import java.util.Scanner;

public class exercise10 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please enter the size of array you want to create: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i ++){
            System.out.print("Enter the element arr[" + i + "] = ");
            arr[i]=sc.nextInt();
        }
        System.out.print("Your array is ");
        for (int elements : arr) {
            System.out.print(elements + " ");
        }
        int min = arr[0];
         for(int i = 1; i < arr.length; i++){
            if (arr[i] < min) {
                min = arr [i];
            }
         }
         System.out.print("The min of array is " + min);
    }
}
