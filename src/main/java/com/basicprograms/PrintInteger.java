package com.basicprograms;

import java.util.Scanner;

public class PrintInteger {
    public static void main(String[] args) {
        int num;
        System.out.println("enter integer");

        Scanner scanner = new Scanner(System.in);
        num=scanner.nextInt();
        System.out.println("Entered Integer is :"+num);
        scanner.close();
    }
}
