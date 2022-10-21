package com.iad.collections;

public class Person {
    private String name;
    private String surname;
    private int age;
    private String gender;
    private double yearlyIncome;

    public Person(String name, String surname, int age, String gender, double yearlyIncome) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.yearlyIncome = yearlyIncome;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", surname=" + surname + ", age=" + age + ", gender=" + gender + ", yearlyIncome=" + yearlyIncome + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getYearlyIncome() {
        return yearlyIncome;
    }

    public void setYearlyIncome(double yearlyIncome) {
        this.yearlyIncome = yearlyIncome;
    }
    
    
}
