package com.iad.collections;

public class Airplane {
    private String tailNumber;
    private int speed;

    public Airplane() {
    }

    public Airplane(String tailNumber, int speed) {
        this.tailNumber = tailNumber;
        this.speed = speed;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public void setTailNumber(String tailNumber) {
        this.tailNumber = tailNumber;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Airplane{" + "tailNumber=" + tailNumber + ", speed=" + speed + '}';
    }
    
    
}
