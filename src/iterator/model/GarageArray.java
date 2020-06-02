package iterator.model;

import Hierarchy.FamilyCar;
import iterator.garage.*;
import iterator.iterators.Iterator;

import java.text.MessageFormat;

public class GarageArray {
    private String street;
    private String district;

    private FirstGarage firstGarage;
    private SecondGarage secondGarage;
    private ThirdGarage thirdGarage;

    public GarageArray(
            String street,
            String district,
            FirstGarage firstGarage,
            SecondGarage secondGarage,
            ThirdGarage thirdGarage
                       ) {
        this.street = street;
        this.district = district;
        this.firstGarage = firstGarage;
        this.secondGarage = secondGarage;
        this.thirdGarage = thirdGarage;
    }

    public void showInfo() {
        System.out.println(MessageFormat.format("Гаражный массив на улице {0}, район {1}", street, district));
        System.out.println("Первый гараж:");
        showGarageInfo(firstGarage.createIterator());
        System.out.println("Второй гараж:");
        showGarageInfo(secondGarage.createIterator());
        System.out.println("Третий гараж:");
        showGarageInfo(thirdGarage.createIterator());
    }

    private void showGarageInfo(Iterator iterator) {
        while (iterator.hasNext()) {
            FamilyCar car = (FamilyCar) iterator.next();
            System.out.println(car.showInfo());
        }
    }
}
