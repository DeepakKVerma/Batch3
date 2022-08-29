package com.training.inner;

class LocalOuterClass
{
    public void outerMethod()
    {
        class InnerClass
        {
            public void printSomething(){
                System.out.println("Inner class from Local method");
            }

            public void hello(){
                System.out.println("Inner class from hello method");
            }
        }
        InnerClass ic = new InnerClass();
        ic.printSomething();
        ic.hello();
    }
}

public class LocalInnerDemo {
    public static void main(String[] args)
    {
        LocalOuterClass loc = new LocalOuterClass();
        loc.outerMethod();
    }
}
