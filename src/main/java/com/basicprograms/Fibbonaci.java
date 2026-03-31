package com.basicprograms;

public class Fibbonaci {
    public static void main(String[] args) {
        int count=10;
        printFibNumber(count);

    }

    private static void printFibNumber(int count) {
        int n1=0,n2=1,n3;
        System.out.println(n1);
        System.out.println(n2);
        for(int i=2;i<count;i++){
            n3=n2+n1;
            System.out.println(n3);
            n1=n2;
            n2=n3;

        }
    }
}
