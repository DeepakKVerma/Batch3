package com.training.inner;

class OuterClass {  //Outer Class
    class InnerClass {  //Inner Class
        public void printSomething() {
            System.out.println("Its inner class");
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        //Outer Object
        OuterClass outer = new OuterClass();

        //Inner Object
        OuterClass.InnerClass inner = outer.new InnerClass();

        inner.printSomething();
    }
}
