package com.training.inner;

public class StaticDemo {
    int i = 10;
    static int j = 20;

    public static void main(String[] args) {
        StaticDemo sd1 = new StaticDemo();
        System.out.println(sd1.i + "--------" + sd1.j);

        sd1.i = 100;
        sd1.j = 200;

        StaticDemo sd2 = new StaticDemo();
        System.out.println(sd2.i + "--------" + sd2.j);

        sd2.i = 1000;
        sd2.j = 2000;

        StaticDemo sd3 = new StaticDemo();
        System.out.println(sd3.i + "--------" + sd3.j);
    }
}
