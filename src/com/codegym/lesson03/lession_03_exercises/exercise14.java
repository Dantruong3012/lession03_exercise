package com.codegym.lesson03.lession_03_exercises;

import java.util.Scanner;

public class exercise14 {
    public static final Scanner sc = new  Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please enter a text: ");
        String text = sc.nextLine();
        System.out.print("Please enter the character you want to count the number of occurrences: ");
        String alphabet = sc.nextLine();
         int count = 0;
         char ch = alphabet.charAt(0);
        for(int i = 0; i < text.length(); i++){
            if (text.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println(count);
    }
}
