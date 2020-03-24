package Hierarchy;

import AbstractFactory.*;
import AbstractFactory.Spare.*;

public class FamilyCar extends PassengerCar{
    private int trunkVolume;
    private String model;
    private SpareFactory factory;

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

    public FamilyCar(int maxSpeed, String color, double price, String steeringWheelPosition, int maxPassengers, String typeFuel, int trunkVolume, String model, SpareFactory factory) {
        super(maxSpeed, color, price, steeringWheelPosition, maxPassengers, typeFuel);
        this.trunkVolume = trunkVolume;
        this.model = model;
        this.factory=factory;
    }
    public FamilyCar(int maxSpeed, String color, double price, String steeringWheelPosition, int maxPassengers, String typeFuel, int trunkVolume, String model) {
        super(maxSpeed, color, price, steeringWheelPosition, maxPassengers, typeFuel);
        this.trunkVolume = trunkVolume;
        this.model = model;
    }
    @Override
    public void assemblyCar()
    {
        this.engine = factory.createEngine();
        this.brakeSystem = factory.createBrakeSystem();
    }
}
