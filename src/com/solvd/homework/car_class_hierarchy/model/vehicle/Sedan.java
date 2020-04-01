package com.solvd.homework.car_class_hierarchy.model.vehicle;

public class Sedan extends Car {
    private int wheelRadius;

    public Sedan(String engine, int maxSpeed, int year) {
        super(engine, maxSpeed, year);
    }

    public Sedan(String engine, String color, String number, int maxSpeed, int year, int wheelRadius) {
        super(engine, color, number, maxSpeed, year);
        this.wheelRadius = wheelRadius;
    }

    public Sedan() {
    }

    public int getWheelRadius() {
        return wheelRadius;
    }

    public void setWheelRadius(int wheelRadius) {
        this.wheelRadius = wheelRadius;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "engine='" + getEngine() + '\'' +
                ", color='" + getColor() + '\'' +
                ", number='" + getNumber() + '\'' +
                ", maxSpeed=" + getMaxSpeed() +
                ", year=" + getYear() +
                ", wheelRadius=" + wheelRadius +
                '}';
    }
}