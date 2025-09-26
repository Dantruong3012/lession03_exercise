package com.codegym.lesson03.lession_03_exercises;

import java.util.Scanner;

public class exercise8 {
  private static final Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.print("Please enter the length of array a: ");
    int n1 = sc.nextInt();
    int[] array1 = new int[n1];
    for(int i = 0; i<array1.length; i++){
        System.out.print("a [" + i + "] = ");
        array1[i] = sc.nextInt();
    }
    System.out.println();
    System.out.print("Array a: ");
    for (int element : array1) {
        System.out.print(element + " ");
    }
    System.out.println();
      System.out.println();  // array b

         System.out.print("Please enter the length of array b: ");
     int n2 = sc.nextInt();
    int[] array2 = new int[n2];
    for(int i = 0; i<array2.length; i++){
        System.out.print("b [" + i + "] = ");
        array2[i] = sc.nextInt();
    }
    System.out.println();
    System.out.print("Array b: ");
    for (int element : array2) {
        System.out.print(element + " ");
    }
    // combine.
    System.out.println();
    System.out.println();

    int newArrayLength = n1 + n2;
    int[] newArray = new int[newArrayLength];
    for(int i=0; i<array1.length; i++){
       newArray[i] = array1[i];
    }

    for (int j = 0; j < array2.length; j++){
       newArray[n1 + j] = array2[j];
    }

    System.out.print("Combined array: ");
for (int element : newArray) {
    System.out.print(element + " ");
}
    
  }
}
