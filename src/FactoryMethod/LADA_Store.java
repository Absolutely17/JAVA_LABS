package FactoryMethod;

import AbstractFactory.LadaSpareFactory;
import AbstractFactory.SpareFactory;
import Hierarchy.FamilyCar;
import Hierarchy.LandTransport;

public class LADA_Store extends AutoStore {
    protected LandTransport createCar(String type){
        LandTransport car;
        SpareFactory factory = new LadaSpareFactory(type);
        if (type.equals("Priora")) {
            car = new FamilyCar(180, "black", 3000000, "left", 4, "benzin", 50, "Priora", factory);
        }
        else if (type.equals("Granta")) {
            car = new FamilyCar(150, "black", 2000000, "left", 4, "benzin", 50, "Granta", factory);
        }
        else {
            System.out.println("Wrong name car.");
            return null;
        }
        return car;

    }
}
