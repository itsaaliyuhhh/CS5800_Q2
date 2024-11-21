package org.example;

class Motorcycle extends Vehicle {

    public Motorcycle(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public String getInfo() {
        return "Motorcycle: " + getYear() + " " + getBrand() + " " + getModel();
    }
}
