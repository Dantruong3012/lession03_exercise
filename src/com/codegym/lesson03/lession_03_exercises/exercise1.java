package com.codegym.lesson03.lession_03_exercises;

import java.util.Scanner;

public class exercise1 {
    private static final Scanner sc = new  Scanner(System.in);
    public static void main(String[] args) {
         int size;
      while (true) {
        System.out.print("Let's me know the size of array: ");
        size = sc.nextInt();
        if (size > 20) {
            System.out.println("Can't do with the size over 20");
            continue;
        }
        break;
      }
      //print orginal array.

    int[] arrayEl = createArray(size);
    System.out.print("the orginal array is: ");
    for (int value : arrayEl) {
        System.out.print(value + " ");
        }
    // invert Array.
        int[] invertedArray = invertArray(arrayEl);
        System.out.print("After we have: ");
        for (int value : invertedArray) {
            System.out.print(value + " ");
        }
    }

    public static int[] createArray(int number){
    int[] arrayEl = new int[number];
       for (int i = 0; i < number; i++){
        System.out.print("please enter the element: ");
        arrayEl[i] = sc.nextInt();
       }
       return arrayEl;   
    }

    public static int[] invertArray (int[] array){
        int[] result  = new int[array.length];
        for(int i = 0; i < array.length; i++ ){
            result[i] = array[array.length - 1 - i];
        }
        return result;
    }

};
