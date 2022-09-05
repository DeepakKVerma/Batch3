package com.session3.training;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {
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

        //Normal way
        List<Float> lifeExpList = new ArrayList<Float>();
        for(Country cnt: cntry) {
            if(cnt.lifeExpectancy >= 76.0) {
                lifeExpList.add(cnt.lifeExpectancy);
            }
        }

        System.out.println(lifeExpList);
        //Stream way
        List<Float> lifeExpStrmList = cntry.stream().filter(c->c.lifeExpectancy >= 76.0).
                map(c->c.lifeExpectancy).collect(Collectors.toList());

        System.out.println(lifeExpStrmList);

    }
}
