package com.codegym.lesson03.array;

import java.util.Scanner;

public class arrayInJava {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       System.out.print("Enter n: ");
       int n = sc.nextInt();
       int[] myArray = new int[n];
       for (int i = 0; i < n; i++ ){
        System.out.print("a ["+ i +"] = ");
        myArray[i] = sc.nextInt();
       }
       System.out.println("the length of array is: " + myArray.length);
       System.out.print("the elements of array is: ");
       for (int i = 0; i < n; i++){
        System.out.println("a ["+ i + "] =" + myArray[i]);
       }
       sc.close();
    }
}
