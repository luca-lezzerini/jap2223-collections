package com.iad.collections;

public class MaleGenderTester implements PersonTester {

    @Override
    public boolean test(Person p) {
        return p.getGender().equalsIgnoreCase("M");
    }

}
