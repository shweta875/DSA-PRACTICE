package com.linearsearch;

public class FindMinimumNumberInArray {
    public static void main(String[] args) {
        int[] arr={18,12,17,3,14,28};
       int minNumber=min(arr);
        System.out.println(minNumber);
    }
    public static int min(int[] arr){
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}
