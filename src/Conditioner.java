public class Conditioner extends Decorator {

    LandTransport car;

    public Conditioner(LandTransport car) {
        this.car=car;
    }

    public double getPrice()
    {
        return car.getPrice() + 5000;
    }
    public String showInfo()
    {
        return car.showInfo() + ", Conditioner";
    }
}
