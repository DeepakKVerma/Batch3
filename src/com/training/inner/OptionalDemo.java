package com.training.optional;

import java.util.Locale;
import java.util.Optional;

public class OptionalDemo {
    public Integer sumOfNumbers(Optional<Integer> a, Optional<Integer> b) {
        System.out.println("First Parameter is " + a.isPresent());
        System.out.println("Second Parameter is " + b.isPresent());

        Integer parm1 = a.orElse(new Integer(15));
        Integer parm2 = b.get();

        return parm1 + parm2;
    }

    public static void main(String[] args) {
        OptionalDemo od = new OptionalDemo();
        String[] line = new String[25];
        //String word = line[8].toLowerCase();
        //System.out.println(word);

        Optional<String> posWord = Optional.ofNullable(line[8]);

        //if(posWord.isEmpty()) {
        if((posWord.isPresent())) {
            String word = line[8].toLowerCase();
            System.out.println(word);
        } else {
            System.out.println("Line is null");
        }

        Integer val1 = null;
        Integer val2 = new Integer(10);
        //System.out.println(val1 + val2);

        Optional<Integer> a = Optional.ofNullable(val1);
        Optional<Integer> b = Optional.of(val2);

        System.out.println(od.sumOfNumbers(a, b));
    }
}
