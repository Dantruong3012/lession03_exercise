package com.codegym.lesson03.pass_by_reference_and_pass_by_value;

class pass_by_value {
public static void main(String[] args) {
    int a = 3;
    int b = a;
    System.out.println(a);
    System.out.println(b);
    a = 4;
    System.out.println(a);
    System.out.println(b);
}
}