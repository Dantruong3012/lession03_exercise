package com.codegym.lesson03.methodOfArray;
// 1. Viết một chương trình Java để làm việc với mảng số nguyên. Cụ thể:
// 2. Nhập vào số phần tử của mảng (n).
// 3. Nhập giá trị cho từng phần tử của mảng từ bàn phím.
// 4. In ra toàn bộ mảng.
// 5. Tìm phần tử lớn nhất và nhỏ nhất trong mảng.
// 6. Tính tổng và giá trị trung bình của các phần tử.
// 7. Đếm xem có bao nhiêu số chẵn và bao nhiêu số lẻ trong mảng.

import java.util.Scanner;

public class exerciseOfArray {
    private static final Scanner sc = new  Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int [] myArray = new int[n];
        System.out.println();
        for (int i = 0; i < myArray.length; i++){
            System.out.print("a  [" + i + "] = ");
            myArray [i] = sc.nextInt();
        }
System.out.print("Array element is: ");
        for (int itemsInArray : myArray) {
            System.out.print(itemsInArray + " ");
        }
        System.out.println();
       
      int[] array = minAndMax(myArray);
      System.out.println("\nMin = " + array[0] + ", Max = " + array[1]);
      System.out.println();
        // Count sum
        int sumOfArray = sumArray(myArray);
        System.out.println("Sum of array is "+sumOfArray);
System.out.println();
        double average = averageOfArray(sumOfArray, myArray);
        System.out.printf("The average of array is %.2f%n " , average);
System.out.println();

int[] odd_even = odd_even_counting(myArray);
System.out.println("the even is "+odd_even[0]+", the odd is " + odd_even[1]);
    }
public static int[] minAndMax(int[] array){
int min = array[0];
int max = array[0];
for (int items : array) {
    if (items < min) min = items;
    if (items>max) max = items;
}
return new int[]  {min, max};
}

public static int sumArray(int[] sumOfArray){
    int sum = 0;
for (int i= 0; i < sumOfArray.length; i++){
    sum += sumOfArray[i];
}
return sum;
}

public static double averageOfArray(int sum, int[] arr ){
return (double) sum / arr.length;
}

public static int[] odd_even_counting(int[] arr){
int odd = 0;
int even = 0;
for (int value : arr) {
    if (value % 2 == 0) {
        even ++;
    }else{
        odd ++;
    }
}
return new int[] {even, odd};
}

}
