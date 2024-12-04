package TrafficLightsSystem;

public interface State {
    void handle(TrafficLight trafficLight);
}

// TODO: Create States for "Red", "Yellow" and "Green" implementing the State interface
// TODO: You can print the color of the state to the console in the handle method as "showColor" won't work anymore after refactoring