package com.training.inner;

class College {
    public void collegeName(String name) {
        System.out.println("The college name is : " + name);
    }
}

public class AnonymousClassDemo {
    public static void main(String[] args) {

        College c2 = new College();
        c2.collegeName("Bangalore Dental college");


        College c1 = new College()
        {
            public void collegeName(String name) {
                System.out.println("This is an engineering college and the college name is : " + name);
            }
        };

        c1.collegeName("IIT Mumbai");
    }
}
