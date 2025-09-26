package com.codegym.lesson03.array;

public class quickCreateArray {
    public static void main(String[] args) {
        int[] myArray = {12, 13, 14};
        for (int i = 0; i < myArray.length; i++ ){
            System.out.println(myArray[i]);
        }
System.out.println();
        // for each.
        for (int items : myArray) {
            System.out.println(items + "\n");
        }
    }
}
