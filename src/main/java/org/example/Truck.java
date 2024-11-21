package org.example;

class Truck extends Vehicle {

    public Truck(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public String getInfo() {
        return "Truck: " + getYear() + " " + getBrand() + " " + getModel();
    }
}