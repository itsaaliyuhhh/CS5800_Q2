package org.example;

import java.util.Random;
import java.util.concurrent.TimeUnit;

abstract class TrafficLightState {
    protected String color;

    public TrafficLightState(String color) {
        this.color = color;
    }

    public abstract void transition(TrafficLight trafficLight);

    public String getColor() {
        return color;
    }
}
