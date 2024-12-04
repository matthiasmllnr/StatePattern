package TrafficLightsSystem;

public class Red implements State {
    @Override
    public void handle(TrafficLight trafficLight) {
        System.out.println("Red");
        trafficLight.setState(new Yellow());
    }
}
