/*
 */
package com.iad.collections;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author use
 */
public class LambdaExpression {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Person> students = new ArrayList<>();
        students.add(new Person("Albert", "Einstein", 90, "M", 20_000));
        students.add(new Person("Marie", "Curie", 43, "F", 30_000));
        students.add(new Person("Napoleone", "Bonaparte", 23, "M", 10_000));
        students.add(new Person("Ivar", "Jacobson", 12, "M", 10_000));
        students.add(new Person("Joan", "Baez", 25, "F", 15_000));

        GoodOldLibrary.printAll4Gender(students, "M");
        System.out.println("----");
        GoodOldLibrary.printAll4Gender(students, "F");
        System.out.println("----");
        GoodOldLibrary.printAll4Age(students, 18, 27);
        System.out.println("+++++");
        SmarterLibrary.selectPersons(students, new MaleGenderTester());
        System.out.println("+++++");
        SmarterLibrary.selectPersons(students, new AgeTester());
        System.out.println("+++++");
        SmarterLibrary.selectPersons(students, new AgeRangeTester(20, 43));
        System.out.println("****");
        SmarterLibrary.selectPersons(students, new PersonTester() {
            @Override
            public boolean test(Person p) {
                return p.getYearlyIncome() > 20_000;
            }
        });

    }

}
