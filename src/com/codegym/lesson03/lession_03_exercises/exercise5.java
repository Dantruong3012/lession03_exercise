package com.codegym.lesson03.lession_03_exercises;

import java.util.Scanner;

public class exercise5 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = {4, 12, 7, 8, 1, 6, 9};
        int min = minValue(array);
        System.out.print("Min value is: " + min);
    }
    public static int minValue(int[] array){
        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if (min > array[i]) {
               min = array[i];
            }
        }
        return min;
    }
}
