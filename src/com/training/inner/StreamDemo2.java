package com.session3.training;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo2 {
    public static void main(String[] args) {
        List<Country> cntry = new ArrayList<Country>();
        cntry.add(new Country("ABW", "Aruba", 78.4f));
        cntry.add(new Country("AFG", "Afghanistan", 45.9f));
        cntry.add(new Country("AGO", "Angola", 38.3f));
        cntry.add(new Country("AIA", "Anguilla", 76.1f));
        cntry.add(new Country("ALB", "Albania", 71.6f));
        cntry.add(new Country("AND", "Andorra", 83.5f));
        cntry.add(new Country("ANT", "Netherlands Antilles", 74.7f));
        cntry.add(new Country("ARE", "United Arab Emirates", 74.1f));
        cntry.add(new Country("ARG", "Argentina", 75.1f));
        cntry.add(new Country("ARM", "Armenia", 66.4f));

        cntry.stream().filter(c->c.lifeExpectancy >= 76.0).
                forEach(c-> System.out.println(c.name));

        float totalLifeExp = cntry.stream().map(c->c.lifeExpectancy).reduce(0.0f, Float:: sum);
        System.out.println(totalLifeExp);

        System.out.println(cntry.stream().map(c->c.lifeExpectancy).reduce(0.0f, Float::max));

        System.out.println(cntry.stream().filter(c->c.lifeExpectancy < 76.0).count());


        System.out.println(cntry.stream().collect(Collectors.summingDouble(c->c.lifeExpectancy)));

        Map<String, String> clist = cntry.stream().collect(Collectors.toMap(c->c.code, c->c.name));

        System.out.println(clist);


        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

        //get count of empty string
        long count = strings.parallelStream().filter(string -> string.isEmpty()).count();
        System.out.println(count);

        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
    }
}
