package com.basicprograms;

public class FibUsingRecursion {
    static int n1=0,n2=1,n3=0;
    public static void main(String[] args) {
        int count=10;
        printFebNumber(count-2);
    }

    private static void printFebNumber(int i) {
        if(i>0){
            n3=n2+n1;
            n1=n2;
            n2=n3;
            System.out.println(n3);
            printFebNumber(i-1);
        }
    }
}
