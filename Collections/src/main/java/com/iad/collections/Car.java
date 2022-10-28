package com.iad.collections;

public class Car {
    private int power;
    private String plate;
    private int yearOfProduction;

    public Car() {
    }

    public Car(int power, String plate, int yearOfProduction) {
        this.power = power;
        this.plate = plate;
        this.yearOfProduction = yearOfProduction;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" + "power=" + power + ", plate=" + plate + ", yearOfProduction=" + yearOfProduction + '}';
    }
    
    
}
