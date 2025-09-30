package com.codegym.lesson03.lession_03_exercises;

import java.util.Scanner;

public class exercise13 {
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
        // Tính tổng đường chéo chính.
        int sum = 0;
        for(int i = 0; i < myMatrix.length; i++){
                sum+= myMatrix[i][i] + myMatrix[i][i];
        }
        System.out.println("sum1: " + sum);

         // Tính tổng đường chéo  phụ.
         int sum2 = 0;
         for(int i = 0; i < myMatrix.length; i ++){
            sum2 += myMatrix[3-i-1][i];
         }
         System.out.println("sum1: " + sum2);
}
}
