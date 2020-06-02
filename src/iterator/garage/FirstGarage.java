package iterator.garage;

import Hierarchy.FamilyCar;
import iterator.iterators.*;

import java.util.LinkedList;

public class FirstGarage {
    private LinkedList<FamilyCar> cars;

    public FirstGarage(LinkedList<FamilyCar> cars) {
        this.cars = cars;
    }

    public Iterator createIterator() {
        return new LinkedListIter(cars);
    }

}
