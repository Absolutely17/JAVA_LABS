package Hierarchy;

public class SUVCar extends PassengerCar {
    private String model;
    private String typeTransmission;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTypeTransmission() {
        return typeTransmission;
    }

    public void setTypeTransmission(String typeTransmission) {
        this.typeTransmission = typeTransmission;
    }

    public String showInfo()
    {
        return super.showInfo() + ", Model = " + model + ", Type transmission = " + typeTransmission;
    }

    public SUVCar(int maxSpeed, String color, double price, String steeringWheelPosition, int maxPassengers, String typeFuel, String model, String typeTransmission) {
        super(maxSpeed, color, price, steeringWheelPosition, maxPassengers, typeFuel);
        this.model = model;
        this.typeTransmission = typeTransmission;
    }
    @Override
    public void assemblyCar()
    {
        ;
    }
}
