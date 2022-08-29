package com.training.inner;

class OuterDemo {
    void printDemo() {
        System.out.println("Printing message from Outer class method");
    }
}

public class AnonymousClassDemo1 {
        static OuterDemo od = new OuterDemo() {
            void printDemo() {
                super.printDemo();
                System.out.println("This is anonymous class method");
            }
        };
    public static void main(String[] args) {
        od.printDemo();
    }
}

