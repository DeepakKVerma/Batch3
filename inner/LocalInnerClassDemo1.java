package com.training.inner;

class LocalInnerOuter {
    public void m1()
    {
        final int x = 20;
        class InnerClass
        {
            public void printSum() {
                //  int y = 20;
                //  int z = x+y;
                System.out.println(x);
            }
        }
        InnerClass ic = new InnerClass();
        ic.printSum();
    }
}

public class LocalInnerClassDemo1 {
    public static void main(String[] args) {
        LocalInnerOuter av = new LocalInnerOuter();
        av.m1();
    }
}
