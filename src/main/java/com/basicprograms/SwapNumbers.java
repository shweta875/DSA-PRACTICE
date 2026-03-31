package com.basicprograms;

public class SwapNumbers {
    public static void main(String[] args) {
        int m,n;
        m=4;
        n=9;
        swapGivenNumbers(m,n);
    }

    private static void swapGivenNumbers(int m, int n) {
//        int temp=m;
//        m=n;
//        n=temp;
        m=(m+n)-(n=m);
        System.out.println("Value of n :"+n+"\n"+"Value of m:"+m);
    }
}
