package com.codegym.lesson03.lession_03_exercises;

import java.util.Scanner;

public class exercise7 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
         int n = 4;
        int[] array = new int[n];
         for (int i = 0; i < array.length; i++) {
            System.out.print("array[" + i + "] = ");
            array[i] = sc.nextInt();
        }
         System.out.print("Enter the element need to add: ");
        int value = sc.nextInt();
        System.out.print("Enter the index to add the element: ");
        int index = sc.nextInt();
        int[] newArray = java.util.Arrays.copyOf(array, array.length+1);
        if (index <= -1 || index >= n){
            System.out.println("can't do it, please try again! ");
        }

        for(int i = 0; i<newArray.length; i++){
            if (index == i) {
               int temp = newArray[i];
                newArray[i]=value;
                newArray[i+1] = temp;
            }
        }
        System.out.print("Array after add the element: ");
        for(int i = 0; i<newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }
        sc.close();
    }

       
}

