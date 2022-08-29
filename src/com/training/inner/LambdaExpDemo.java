package com.training.inner;

interface Calculation {
    public void calculate();
}
public class LambdaExpDemo {
    public static void main(String[] args) {
        int rateOfInterest = 10;
        Calculation c = () -> {
            System.out.println("Rate of Interest is " + rateOfInterest + "%");
        };

        c.calculate();
    }
}
