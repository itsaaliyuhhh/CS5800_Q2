package org.example;

abstract class Vehicle {
    private String brand;
    private String model;
    private int year;

    private DrivingBehavior drivingBehavior;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;

        this.drivingBehavior = drivingBehavior;
    }

    public abstract String getInfo();
    public abstract String getVehicleType();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}