package Hierarchy;

import AbstractFactory.Spare.BrakeSystem;
import AbstractFactory.Spare.Engine;

public abstract class Car extends LandTransport {
    private String steeringWheelPosition;

    public String getSteeringWheelPosition() {
        return steeringWheelPosition;
    }

    public void setSteeringWheelPosition(String steeringWheelPosition) {
        this.steeringWheelPosition = steeringWheelPosition;
    }
    public String showInfo()
    {
        return super.showInfo() + ", Steering wheel = " + steeringWheelPosition;
    }

    public Car(int maxSpeed, String color, double price, String steeringWheelPosition) {
        super(maxSpeed, color, price);
        this.steeringWheelPosition = steeringWheelPosition;
    }
}
