/*
 */
package com.iad.collections;

import java.time.Duration;
import java.time.Instant;
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

        students.stream()
                .filter(s -> s.getGender().equalsIgnoreCase("F"))
                .filter(t -> t.getAge() < 30)
                .forEach(z -> System.out.println(z));

        students.stream()
                .filter(s -> s.getAge() > 45)
                .filter(s -> s.getAge() < 90)
                .filter(s -> s.getYearlyIncome() > 40_000)
                .forEach(s -> System.out.println(s));

        List<Integer> li = new ArrayList<>(500_000_000);
        for (int i = 0; i < 500_000_000; i++) {
            li.add(i);
        }

        Instant i1 = Instant.now();
        li.stream()
                .filter(s -> s % 2 == 0)
                .forEach(s -> {
                    double x = s * 2;
                });
        Instant e1 = Instant.now();
        Duration d1 = Duration.between(i1, e1);
        Instant i2 = Instant.now();
        li.parallelStream()
                .filter(s -> s % 2 == 0)
                .forEach(s -> {
                    double x = s * 2;
                });
        Instant e2 = Instant.now();
        Duration d2 = Duration.between(i2, e2);
        System.out.println("Stream " + d1.toMillis());
        System.out.println("Parallel Stream " + d2.toMillis());
    }

}
