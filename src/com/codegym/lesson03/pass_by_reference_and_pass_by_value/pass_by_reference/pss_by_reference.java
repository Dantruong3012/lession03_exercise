package com.codegym.lesson03.pass_by_reference_and_pass_by_value.pass_by_reference;

public class pss_by_reference {
    public static void main(String[] args) {
        students A = new students(1, "Kieu Dan Truong");
        students B = A;
        System.out.println(A);
        System.out.println(B);
        A.name = "Ngoc Hieu";
        System.out.println(A);
        System.out.println(B);
    }
}
