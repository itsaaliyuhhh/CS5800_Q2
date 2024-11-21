package org.example;

class RedState extends TrafficLightState {

    public RedState() {
        super("Red");
    }

    @Override
    public void transition(TrafficLight trafficLight){
        trafficLight.setState(new GreenState());
    }
}
