package org.example;

class Car extends Vehicle {
    public Car(String brand, String model, int year) {
            super(brand, model, year);
    }

    @Override
    public String getInfo() {
        return "Car: " + getYear() + " " + getBrand() + " " + getModel();
    }

    @Override
    public String getVehicleType() {
        return "Car";
    }
}
