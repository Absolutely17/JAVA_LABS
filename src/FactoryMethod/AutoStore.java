package FactoryMethod;

import Hierarchy.LandTransport;

public abstract class AutoStore {

    public LandTransport orderCar(String type)
    {
        LandTransport car;
        car = createCar(type);
        car.assemblyCar();
        return car;
    }

    protected abstract LandTransport createCar(String type);
}
