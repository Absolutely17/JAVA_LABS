public abstract class PassengerCar extends Car {
    public int maxPassengers;
    private String typeFuel;

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public String showInfo()
    {
        return super.showInfo() + ", Max passengers = " + maxPassengers + ", Fuel type = " + typeFuel;
    }
    public PassengerCar(int maxSpeed, String color, String steeringWheelPosition, int maxPassengers, String typeFuel) {
        super(maxSpeed, color, steeringWheelPosition);
        this.maxPassengers = maxPassengers;
        this.typeFuel=typeFuel;
    }
}
