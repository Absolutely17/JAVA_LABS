package Hierarchy;

import AbstractFactory.Spare.BrakeSystem;
import AbstractFactory.Spare.Engine;

public abstract class LandTransport {
    private int maxSpeed;
    private String color;
    private double price;
    Engine engine;
    BrakeSystem brakeSystem;

    public abstract void assemblyCar();

    public String showInfo() {return "Max speed = " + maxSpeed + ", color = " + color + ", price = " + price;}
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LandTransport(int maxSpeed, String color, double price) {
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.price = price;
    }
    public LandTransport()
    {}
}
