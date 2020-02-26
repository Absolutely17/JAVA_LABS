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
                    cars.add(new FamilyCar(160, "black", "right", 6, "benzine",500, "Mercedes-Benz CLA"));
                    break;
                }
                case 2:
                {
                    cars.add(new FamilyCar(160, "red", "left", 4, "benzine",700, "Audi A4 Avant"));
                    break;
                }
                case 3:
                {
                    cars.add(new SUVCar(180, "white", "right", 4, "diesel", "KIA Mohave", "manual"));
                    break;
                }
                case 4: {
                    cars.add(new SUVCar(165, "black", "left", 4, "benzine", "Chevrolet Tahoe", "automatic"));
                    break;
                }
                case 5:
                {
                    cars.add(new FamilyCar(150, "orange", "right", 7, "diesel", 985, "Lada Largus"));
                    break;
                }
            }
        }
            cars.add(new FamilyCar(160, "black", "right", 6, "benzine",500, "Mercedes-Benz"));
        for (int i=0;i<countObjects;i++)
            System.out.println(cars.get(i).showInfo());

    }
}
