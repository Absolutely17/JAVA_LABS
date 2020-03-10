public abstract class Lorry extends  Car {
    private int maxTransportedWeight;
    private boolean isRecliningCab;

    public int getMaxTransportedWeight() {
        return maxTransportedWeight;
    }

    public void setMaxTransportedWeight(int maxTransportedWeight) {
        this.maxTransportedWeight = maxTransportedWeight;
    }

    public boolean isRecliningCab() {
        return isRecliningCab;
    }

    public void setRecliningCab(boolean recliningCab) {
        isRecliningCab = recliningCab;
    }

    public Lorry(int maxSpeed, String color, double price, String steeringWheelPosition, int maxTransportedWeight, boolean isRecliningCab) {
        super(maxSpeed, color, price, steeringWheelPosition);
        this.maxTransportedWeight = maxTransportedWeight;
        this.isRecliningCab = isRecliningCab;
    }
}
