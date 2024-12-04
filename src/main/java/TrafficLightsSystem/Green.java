package TrafficLightsSystem;

public class Green implements State {
    @Override
    public void handle(TrafficLight trafficLight) {
        System.out.println("Green");
        trafficLight.setState(new Red());
    }
}
