package com.linearsearch;

public class FindMaxNumberIn2DArray {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4,5},
                {2,51,7,8},
                {3,4,6},
                {9,9,23}
        };
        int maxNumber= max(arr);
        System.out.println(maxNumber);

    }
    static int max(int[][] arr){
        int maxNumber =Integer.MIN_VALUE;
        for(int [] rowArray :arr){
            for(int colElement: rowArray){
                if(colElement> maxNumber){
                    maxNumber = colElement;
                }
            }
        }
        return maxNumber;
    }
}
