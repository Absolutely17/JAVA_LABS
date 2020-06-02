package iterator.garage;

import Hierarchy.FamilyCar;
import iterator.iterators.*;
import iterator.iterators.Iterator;

import java.util.*;

public class SecondGarage {
    private ArrayList<FamilyCar> cars;

    public SecondGarage(ArrayList<FamilyCar> cars) {
        this.cars = cars;
    }

    public Iterator createIterator() {
        return new ArrayListIter(cars);
    }
}
