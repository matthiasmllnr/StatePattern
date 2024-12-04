package TrafficLightsSystem;

public class Yellow implements State {
    @Override
    public void handle(TrafficLight trafficLight) {
        System.out.println("Yellow");
        trafficLight.setState(new Green());
    }
}
