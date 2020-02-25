public abstract class PassengerCar extends Car {
    public int maxPassengers;

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public PassengerCar(int maxSpeed, String color, String steeringWheelPosition, int maxPassengers) {
        super(maxSpeed, color, steeringWheelPosition);
        this.maxPassengers = maxPassengers;
    }
}
