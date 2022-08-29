package com.training.inner;

class A {
    public void printSomething(String msg) {
        System.out.println("Outer Class Message from main method : " + msg);
    }
    class B {
        public void inner_b(){
            System.out.println("Its an inner Class");
        }

        public void printSomething(String str) {
            System.out.println("Inner Class Message from main method : " + str);
        }
    }
}


public class InnerClassDemo1 {
    public static void main(String[] args) {
        A a = new A();
        a.printSomething("Message for Outer Class");

        A.B b = a.new B();
        b.inner_b();
        b.printSomething("Message for Inner class");
    }
}
