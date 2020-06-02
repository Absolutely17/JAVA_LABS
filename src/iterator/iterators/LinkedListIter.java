package iterator.iterators;

import Hierarchy.FamilyCar;

import java.util.LinkedList;

public class LinkedListIter implements Iterator {
    private LinkedList<FamilyCar> cars;
    private int position = 0;

    public LinkedListIter(LinkedList<FamilyCar> cars) {
        this.cars = cars;
    }

    @Override
    public boolean hasNext() {
        return position < cars.size() && cars.get(position) != null;
    }

    @Override
    public Object next() {
        FamilyCar car = cars.get(position++);
        return car;
    }
}
