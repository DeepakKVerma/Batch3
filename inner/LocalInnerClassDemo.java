package com.training.inner;

class MethodOuterDemo {
    public void m1() {
        class InnerClass {
            public void sum(int x, int y) {
                System.out.println("Sum of two numbers: " + (x + y));
            }
        }
        InnerClass ic = new InnerClass();
        ic.sum(2,3);
        ic.sum(5,4);
        ic.sum(10,15);
        ic.sum(20,25);
    }
}

public class LocalInnerClassDemo {
    public static void main(String[] args) {
        MethodOuterDemo mod = new MethodOuterDemo();
        mod.m1();
    }
}
