package com.iad.collections;

public class AgeRangeTester implements PersonTester{
    private int fromAge;
    private int toAge;

    public AgeRangeTester(int fromAge, int toAge) {
        this.fromAge = fromAge;
        this.toAge = toAge;
    }
    
    @Override
    public boolean test(Person p) {
        return p.getAge()>= fromAge && p.getAge()<=toAge;
    }

}
