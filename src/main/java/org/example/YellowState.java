package org.example;

class YellowState extends TrafficLightState {
    public YellowState() {
        super("Yellow");
    }

    public void transition(TrafficLight trafficLight) {
        trafficLight.setState(new RedState());
    }
}
