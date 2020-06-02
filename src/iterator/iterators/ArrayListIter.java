package iterator.iterators;

import Hierarchy.FamilyCar;

import java.util.ArrayList;

public class ArrayListIter implements Iterator  {
    private ArrayList<FamilyCar> cars;
    private int position = 0;

    public ArrayListIter(ArrayList<FamilyCar> cars) {
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
