package com.training.inner;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpDemo1 {
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        al.add("Ajinkya");
        al.add("Ankita");
        al.add("Badugu");
        al.add("Divya");

        al.forEach(
                (name) -> System.out.println(name)
        );
    }
}
