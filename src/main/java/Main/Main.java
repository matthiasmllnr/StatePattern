package Main;

import TrafficLightsSystem.TrafficLight;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();


        for (int i = 0; i < 6; i++) {
            trafficLight.changeColor();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
