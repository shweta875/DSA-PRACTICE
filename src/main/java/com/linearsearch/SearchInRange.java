package com.linearsearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={12,34,23,3,4,5,7,89,9};
        int target=3;
        int start=2;
        int end=6;
        int index= searchInRange(arr,target,start,end);
        System.out.println(index);


    }
    private static int searchInRange(int[] arr,int target,int start,int end){
       for(int index=start;index<=end;index++){
           if(arr[index]==target){
               return index;
           }
       }
        return -1;
    }
}
