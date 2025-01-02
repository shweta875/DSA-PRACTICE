package com.linearsearch;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String str = "Kunal";
        char target = 'x';
       boolean result=search(str,target);
       boolean result2=search2(str,target);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(Arrays.toString(str.toCharArray()));

    }

    static boolean search(String s, char c) {
        if (s.isEmpty()) {
            return false;
        }
        for(int i=0;i< s.length();i++){
            if(c==s.charAt(i)){
                return true;
            }
        }
        return false;
    }
    static boolean search2(String s, char c) {
        if (s.isEmpty()) {
            return false;
        }
        for(char ch:s.toCharArray()){
            if(ch==c){
                return true;
            }
        }
        return false;
    }
}
