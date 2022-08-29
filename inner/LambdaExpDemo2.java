package com.training.inner;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Employee {
    int id;
    String name;
    float salary;

    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class LambdaExpDemo2 {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<Employee>();

        emp.add(new Employee(1, "Ram K", 20000f));
        emp.add(new Employee(2, "Mohan Babu", 10000f));
        emp.add(new Employee(3, "Manohar S", 12000f));
        emp.add(new Employee(4, "Krishna M", 13000f));
        emp.add(new Employee(5, "Siva R", 14000f));
        emp.add(new Employee(6, "Shakar M", 16000f));
        emp.add(new Employee(7, "Manas L", 18000f));
        emp.add(new Employee(8, "Tapo B", 22000f));
        emp.add(new Employee(9, "Uma U", 24000f));

        Stream<Employee> salary_data = emp.stream().filter(p->p.salary > 15000);

        salary_data.forEach(
                employee -> {System.out.println(employee.name + " has salary " + employee.salary);}
        );
    }
}
