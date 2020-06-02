package iterator.garage;

import Hierarchy.FamilyCar;
import iterator.iterators.*;

public class ThirdGarage {
    private FamilyCar[] cars;

    public ThirdGarage(FamilyCar[] cars) {
        this.cars = cars;
    }

    public Iterator createIterator() {
        return new ArrayIter(cars);
    }
}
