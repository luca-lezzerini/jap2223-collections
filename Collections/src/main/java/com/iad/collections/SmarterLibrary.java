package com.iad.collections;

import java.util.List;
import java.util.function.Predicate;

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

    public static void selectCars(
            List<Car> list,
            CarTester t) {
        for (Car car : list) {
            if (t.test(car)) {
                System.out.println(car);
            }
        }
    }

    public static <T> void selectSomething(
            List<T> list,
            GenericTester<T> t) {
        for (T element : list) {
            if (t.test(element)) {
                System.out.println(element);
            }
        }
    }

    public static <T> void selectVeryGeneric(
            List<T> list,
            Predicate<T> t) {
        for (T element : list) {
            if (t.test(element)) {
                System.out.println(element);
            }
        }
    }
    
    
}
