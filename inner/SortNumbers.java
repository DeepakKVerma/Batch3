package com.training.inner;

public class SortNumbers {
    public static void main(String[] args) {
        int[] listOfNum = {1, 5, 4, 3, 30, 20, 50};
        int[] al = new int[7];
        int previous = listOfNum[0];
        int current = 0;

        for(int i=0; i<listOfNum.length; i++) {
            current = listOfNum[i];
            if(current >= previous) {
                al[i] = current;
            } else {
                al[i] = previous;
                al[i-1] = current;
            }
            previous = current;
            // System.out.println(listOfNum[i]);
        }

        for(int j =0; j<al.length; j++) {
            System.out.println(al[j]);
        }
    }
}
