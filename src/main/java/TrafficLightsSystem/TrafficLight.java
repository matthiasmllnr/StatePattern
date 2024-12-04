package TrafficLightsSystem;

public class TrafficLight {
    private String color; // TODO: Use state instead of storing color in a String

    public TrafficLight() {
        this.color = "RED"; // TODO: Set initial state of Red
    }

    // TODO: Add method for setting state

    // TODO: Replace hard-coded color chaning to using the state.handle method
    public void changeColor() {
        if (color.equals("RED")) {
            color = "GREEN";
        } else if (color.equals("GREEN")) {
            color = "YELLOW";
        } else if (color.equals("YELLOW")) {
            color = "RED";
        }
    }

    // TODO: Will be removed
    public void showColor() {
        System.out.println("The traffic light is " + color);
    }
}

