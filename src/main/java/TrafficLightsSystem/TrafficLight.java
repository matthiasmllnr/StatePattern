package TrafficLightsSystem;

public class TrafficLight {
    private State currentState;

    public TrafficLight() {
        this.currentState = new Red();
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void changeColor() {
        currentState.handle(this);
    }
}
