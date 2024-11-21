package org.example;

class GreenState extends TrafficLightState{
    public GreenState() {
        super("Green");
    }

    @Override
    public void transition(TrafficLight trafficLight) {
        trafficLight.setState(new YellowState());
    }
}
