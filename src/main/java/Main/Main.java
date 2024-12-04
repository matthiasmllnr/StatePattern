package Main;

import TrafficLightsSystem.TrafficLight;

public class Main {
    // TODO: When done, adjust Main-Method to work with the new code and do some state-changing
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.showColor();
        trafficLight.changeColor();
        trafficLight.showColor();
        trafficLight.changeColor();
        trafficLight.showColor();
    }
}
