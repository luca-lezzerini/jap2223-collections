package com.iad.collections;

public class AgeTester implements PersonTester {

    @Override
    public boolean test(Person p) {
        return p.getAge() >= 18;
    }

}
