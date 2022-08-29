package com.training.inner;
//Static nested class

class OuterA {
    static class InnerB {
        public void m1() {
            System.out.println("Static nested class method");
        }
    }
}

public class StaticInnerDemo1 {
    public static void main(String[] args) {
        OuterA.InnerB b = new OuterA.InnerB();
        b.m1();
    }
}
