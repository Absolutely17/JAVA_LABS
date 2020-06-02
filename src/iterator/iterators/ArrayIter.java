package iterator.iterators;

import Hierarchy.FamilyCar;

public class ArrayIter implements Iterator {
    private FamilyCar[] cars;
    private int position = 0;

    public ArrayIter(FamilyCar[] cars) {
        this.cars = cars;
    }

    @Override
    public boolean hasNext() {
        return position < cars.length && cars[position] != null;
    }

    @Override
    public Object next() {
        FamilyCar car = cars[position++];
        return car;
    }
}
