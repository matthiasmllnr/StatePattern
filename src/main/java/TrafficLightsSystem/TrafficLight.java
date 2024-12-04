package TrafficLightsSystem;

public class TrafficLight {
    private State currentState; // TODO: Use state instead of storing color in a String

    public TrafficLight() {
        this.currentState = new Red(); // TODO: Set initial state of Red
    }

    // TODO: Add method for setting state
    public void setState(State state) {
        this.currentState = state;
    }

    // TODO: Replace hard-coded color chaning to using the state.handle method
    public void changeColor() {
        currentState.handle(this);
    }
}
