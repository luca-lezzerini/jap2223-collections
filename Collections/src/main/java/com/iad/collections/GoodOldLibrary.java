package com.iad.collections;

import java.util.List;

public class GoodOldLibrary {

    public static void printAllMales(List<Person> list) {
        for (Person person : list) {
            if (person.getGender().equalsIgnoreCase("M")) {
                System.out.println(person);
            }
        }
    }

    public static void printAllFemales(List<Person> list) {
        for (Person person : list) {
            if (person.getGender().equalsIgnoreCase("F")) {
                System.out.println(person);
            }
        }
    }

    public static void printAll4Gender(List<Person> list,
            String gender) {
        for (Person person : list) {
            if (person.getGender().equalsIgnoreCase(gender)) {
                System.out.println(person);
            }
        }
    }

    public static void printAll4Age(List<Person> list,
            int fromAge, int toAge) {
        for (Person person : list) {
            if (person.getAge() >= fromAge
                    && person.getAge() <= toAge) {
                System.out.println(person);
            }
        }
    }
}
