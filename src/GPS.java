public class GPS extends Decorator {

    LandTransport car;

    public GPS(LandTransport car){
        this.car=car;
    }

    public double getPrice(){
        return car.getPrice() + 2500;
    }

    public String showInfo(){
        return car.showInfo() + ", GPS";
    }
}
