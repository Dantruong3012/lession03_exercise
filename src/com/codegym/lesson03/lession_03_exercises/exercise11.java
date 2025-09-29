package com.codegym.lesson03.lession_03_exercises;

import java.util.Scanner;

public class exercise11 {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number of Student: ");
        int n = sc.nextInt();
        int[] arrayScore = new int[n];
         for (int i = 0; i < n; i ++){
            int count = i+1;
            System.out.print("Enter student's scores " +  count + " : ");
            arrayScore[i] = sc.nextInt();
         }
         for (int i = 0; i < arrayScore.length; i++){
            int count = i + 1;
            System.out.println("The score of student [" + count + "] is: " + arrayScore[i]);
         }
         System.out.println();
         System.out.print("List of mark is: ");
         for (int item : arrayScore) {
            System.out.print(item + " ");
         }

         int countPass = chekingMark(arrayScore);
         System.out.println("passed is: " + countPass);


    }

    static int chekingMark(int[] arr){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if (arr[i] > 5) {
                count+=1;
            }
        }
        return count;
    }
}
