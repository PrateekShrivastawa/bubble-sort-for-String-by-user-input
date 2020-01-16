package com.company;

import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        String temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a = Integer.parseInt(sc.nextLine());
        String[] arr = new String[a];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the " + (i + 1) + " element");
            arr[i] = sc.nextLine();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("The sorted array is given below");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
