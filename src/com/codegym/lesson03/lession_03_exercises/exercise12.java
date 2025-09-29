package com.codegym.lesson03.lession_03_exercises;

import java.util.Scanner;

public class exercise12 {
    public static final Scanner sc = new    Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please enter the number of rows: ");
        int r = sc.nextInt();
        System.out.print("Please enter the number of columns: ");
        int c = sc.nextInt();
        int[][] myMatrix = new int[r][c];
        for(int i = 0; i < r; i ++){
            for(int j = 0; j < c; j++){
                 System.out.print("matrix[" + i + "][" + j + "] = ");
                myMatrix[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Your matrix:");
        for(int i = 0; i < myMatrix.length; i ++){
            for (int j = 0; j < myMatrix[i].length; j++){
                System.out.print(myMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
       int[] newAraay = new int[c];
       for(int i = 0; i < myMatrix.length; i++){
        for(int j = 0; j < myMatrix[i].length; j++){
            newAraay[j] += myMatrix[i][j];
        }
       }
       System.out.print("Please enter the column you want to sum: ");
       int number = sc.nextInt();
       for(int i = 0; i < newAraay.length; i++){
        if (number == i) {
            System.out.println("The result you want to caculate is: " + newAraay[i]);
        }
       }
       sc.close();
}
}
