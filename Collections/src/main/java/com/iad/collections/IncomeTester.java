package com.iad.collections;

public class IncomeTester implements PersonTester {

    @Override
    public boolean test(Person p) {
        return p.getYearlyIncome() > 20_000;
    }
}
