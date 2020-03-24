import Decorator.*;
import FactoryMethod.AutoStore;
import FactoryMethod.LADA_Store;
import Hierarchy.*;
import Threads.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LandTransport> cars = new ArrayList<>();
        int countObjects = 1 + (int) (Math.random() * 6);
        for (int i=0;i<countObjects;i++)
        {
            switch (1+(int)(Math.random() * 5))
            {
                case 1:
                {
                    cars.add(new FamilyCar(160, "black", 54546, "right", 6, "benzine",500, "Mercedes-Benz CLA"));
                    break;
                }
                case 2:
                {
                    cars.add(new FamilyCar(160, "red", 5456, "left", 4, "benzine",700, "Audi A4 Avant"));
                    break;
                }
                case 3:
                {
                    cars.add(new SUVCar(180, "white", 54546 , "right", 4, "diesel", "KIA Mohave", "manual"));
                    break;
                }
                case 4: {
                    cars.add(new SUVCar(165, "black",6789 , "left", 4, "benzine", "Chevrolet Tahoe", "automatic"));
                    break;
                }
                case 5:
                {
                    cars.add(new FamilyCar(150, "orange",55454,"right", 7, "diesel", 985, "Lada Largus"));
                    break;
                }
            }
        }
            cars.add(new FamilyCar(160, "black",5554 ,"right", 6, "benzine",500, "Mercedes-Benz"));
        for (int i=0;i<countObjects;i++) {
            System.out.println(cars.get(i).showInfo());
            System.out.println("Цена: " + cars.get(i).getPrice());
        }

        //Decorator test
        LandTransport car = cars.get(1);
        car = new Conditioner(car);
        car = new GPS(car);
        System.out.println(car.showInfo());
        System.out.println("Цена: " + car.getPrice());

        //Threads test
        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);
        //t1.start();
        //t2.start();

        //Factory method test
        LandTransport selectedCar;
        AutoStore ladaStore = new LADA_Store();
        selectedCar = ladaStore.orderCar("Priora");
        selectedCar = new GPS(selectedCar);
        selectedCar = new Conditioner(selectedCar);
        System.out.println(selectedCar.showInfo());
        System.out.println("Цена: " + selectedCar.getPrice());

        //Abstract factory test
        LandTransport carForIlya;
        carForIlya = ladaStore.orderCar("Priora");
        
    }
}
