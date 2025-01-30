package com.learning.core.operators;

import java.util.Arrays;
import java.util.List;

public class InstanceOfOperator {
    public static void main(String[] args) {

        Integer data = 10;
        String name = "Bharath";


        if (data instanceof Integer) {
            System.out.println("data is of type Integer");
        }

        if (name instanceof String) {
            System.out.println("name is of type string");
        }


        Persons person1 = new Employee();
        Persons person2 = new Student();
        Persons person3 = new Scientist();
        Persons person4 = new Student();
        Persons person5 = new Employee();

        List<Persons> personList = Arrays.asList(person1, person2, person3, person4, person5);


        for (Persons persons : personList) {
            if (persons instanceof Student) {
                System.out.println("Apply the scheme");
            }
        }





    }

}

    class Persons { }

class Student extends Persons {}

 class Employee extends Persons {}

class Scientist extends Persons {}
