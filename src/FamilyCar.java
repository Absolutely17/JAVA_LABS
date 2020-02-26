public class FamilyCar extends PassengerCar{
    private int trunkVolume;
    private String model;

    public int getTrunkVolume() {
        return trunkVolume;
    }

    public void setTrunkVolume(int trunkVolume) {
        this.trunkVolume = trunkVolume;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String showInfo()
    {
        return super.showInfo() + ", Volume trunk = " + trunkVolume + ", Model = " + model;
    }
    public FamilyCar(int maxSpeed, String color, String steeringWheelPosition, int maxPassengers, String typeFuel, int trunkVolume, String model) {
        super(maxSpeed, color, steeringWheelPosition, maxPassengers, typeFuel);
        this.trunkVolume = trunkVolume;
        this.model = model;
    }
}
