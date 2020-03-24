package FactoryMethod;

import AbstractFactory.*;
import Hierarchy.FamilyCar;
import Hierarchy.LandTransport;

public class BMW_Store  extends AutoStore{
    protected LandTransport createCar(String type){
        LandTransport car;
        SpareFactory factory = new BMWSpareFactory(type);
        if (type.equals("X5")) {
            car = new FamilyCar(190, "white", 5000000, "left", 5, "benzin", 100, "X5", factory);
        }
        else if (type.equals("X3")) {
            car = new FamilyCar(150, "black", 4500000, "left", 4, "benzin", 130, "X3", factory);
        }
        else {
            System.out.println("Wrong name car.");
            return null;
        }
        return car;

    }
}
