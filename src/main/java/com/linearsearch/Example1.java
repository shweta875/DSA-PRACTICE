package com.linearsearch;

public class Example1 {

        public static void main(String[] args) {
            //search in array return index if number found
            //return -1 if not found
            int[] num={1,2,3,4,5,6,7,8,9,14,375};
            int indexNum=linearSearch(num,18);
            System.out.println(indexNum);
            System.out.println("main Branch change");

        }

        static int linearSearch(int[] arr,int target){
            if(arr.length==0){
                return -1;
            }
            for (int i=0;i<arr.length;i++){
                //check for element at every index if it is equal to target
                int element=arr[i];
                if(element==target) {return i;}
            }
            return -1;

        }

}
