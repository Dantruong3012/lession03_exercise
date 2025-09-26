package com.codegym.lesson03.lession_03_exercises;

import java.util.Scanner;

public class exercise2 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] students = {
            "Christian", "Michael", "Camila", "Sienna", "Tanya",
            "Connor", "Zachariah", "Mallory", "Zoe", "Emily"
        };

        System.out.print("Please enter student name: ");
        String name = sc.nextLine();
        name=name.toLowerCase();

        if (isExist(name, students)) {
            int id = findStudent(students, name);
            System.out.println(name + " has id " + id);
        } else {
            System.out.println("not found!");
        }
    }

    public static boolean isExist(String student, String[] listOfStudent) {
        for (String s : listOfStudent) {
            if (student.toLowerCase().equals(s.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public static int findStudent(String[] array, String name) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].toLowerCase().equals(name)) {
                return i + 1; // vị trí bắt đầu từ 1
            }
        }
        return -1;
    }
} 