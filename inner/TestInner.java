package com.training.inner;

class TestInner {
    void showDummy() {
        System.out.println("This is from outer method");
    }

    class TestOuter {
        //TestInner.this.showDummy();
    }
}


