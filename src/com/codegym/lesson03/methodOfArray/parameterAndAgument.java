package com.codegym.lesson03.methodOfArray;

import java.util.Scanner;

public class parameterAndAgument {
    private static final Scanner sc = new   Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("vui long nhap so a: ");
        int a = sc.nextInt();
        System.out.print("vui long nhap so b: ");
        int b = sc.nextInt();
        System.out.println(sum(a, b));
    }

    public static int sum(int numA, int numB) {
    return numA + numB;
        
    }
}
