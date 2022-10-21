package com.iad.collections;

import java.util.List;

public class SmarterLibrary {

    public static void selectPersons(
            List<Person> list,
            PersonTester t) {
        for (Person person : list) {
            if (t.test(person)) {
                System.out.println(person);
            }
        }
    }
}
