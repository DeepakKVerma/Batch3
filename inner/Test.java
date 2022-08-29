package com.training.inner;

public class Test {
    public static void main(String[] args) {
        String str = "NAVJEEVAN";
        int len = str.length();
        String str1 = "";
        for(int i = len-1; i >= 0; i--) {
            str1 = str1 + str.charAt(i);
        }
        System.out.println("Opposite for the name " + str + " is " +  str1);
    }

}
