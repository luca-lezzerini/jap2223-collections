/*
 */
package com.iad.collections;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author use
 */
public class CarsLambdas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(100, "AL212AB", 2020));
        cars.add(new Car(90, "AL313AB", 2021));
        cars.add(new Car(190, "AL414AB", 2022));
        cars.add(new Car(90, "AL515AB", 2017));

        List<Person> students = new ArrayList<>();
        students.add(new Person("Albert", "Einstein", 90, "M", 20_000));
        students.add(new Person("Marie", "Curie", 43, "F", 30_000));
        students.add(new Person("Napoleone", "Bonaparte", 23, "M", 10_000));
        students.add(new Person("Ivar", "Jacobson", 12, "M", 10_000));
        students.add(new Person("Joan", "Baez", 25, "F", 15_000));

        List<Airplane> fluturimi = new ArrayList<>();
        fluturimi.add(new Airplane("1234", 700));
        fluturimi.add(new Airplane("2345", 800));
        fluturimi.add(new Airplane("3456", 900));

        // type inference is the ability of the Java compiler to exactly guess a type
        int lowerPower = 100;
        int lowerPower2 = lowerPower + 50;
        SmarterLibrary.selectSomething(cars, c -> c.getPower() > lowerPower2);
        System.out.println("---------");
        SmarterLibrary.selectSomething(students, c -> c.getAge() > 25);
        System.out.println("---------");
        SmarterLibrary.selectSomething(fluturimi, x -> x.getSpeed() > 750);
        System.out.println("++++++++++++++");
        SmarterLibrary.selectVeryGeneric(cars, c -> c.getPower() > 100);
        System.out.println("---------");
        SmarterLibrary.selectVeryGeneric(students, c -> c.getAge() > 25);
        System.out.println("---------");
        SmarterLibrary.selectVeryGeneric(fluturimi, x -> x.getSpeed() > 750);
    }

}
