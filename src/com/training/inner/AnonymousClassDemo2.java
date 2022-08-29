package com.training.inner;

interface OuterInterface {
    void printHello();
}
public class AnonymousClassDemo2 {
    static OuterInterface od = new OuterInterface() {
        public void printHello() {
            System.out.println("Anonymous class interface");
        }
    };

    public static void main(String[] args) {
        od.printHello();
    }
}
