package com.codegym.lesson03.lession_03_exercises;

import java.util.Scanner;

public class exercise9 {
private static final Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
    System.out.print("Please indicate the number of rows: ");
    int rows = sc.nextInt();
   System.out.print("Please indicate the number of columns: ");
   int columns = sc.nextInt();
   double max = 0;
   double[][] matrix = new double[rows][columns];

   for (int i = 0; i < rows; i++) {
    for (int j = 0; j < columns; j++) {
        System.out.print("matrix[" + i + "][" + j + "] = ");
        matrix[i][j] = sc.nextDouble();
    }
}
  double maxValue = matrix[0][0];
for (int i = 0; i < rows; i++) {
    for (int j = (i == 0 ? 1 : 0); j < columns; j++) {
        if (maxValue < matrix[i][j]) {
            maxValue = matrix[i][j];
        }
    }
}
System.out.println("Max value in matrix: " + maxValue);
}
}
