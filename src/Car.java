public abstract class Car extends LandTransport {
    private String steeringWheelPosition;

    public String getSteeringWheelPosition() {
        return steeringWheelPosition;
    }

    public void setSteeringWheelPosition(String steeringWheelPosition) {
        this.steeringWheelPosition = steeringWheelPosition;
    }

    public Car(int maxSpeed, String color, String steeringWheelPosition) {
        super(maxSpeed, color);
        this.steeringWheelPosition = steeringWheelPosition;
    }
}
