public abstract class LandTransport {
    private int maxSpeed;
    private String color;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LandTransport(int maxSpeed,  String color) {
        this.maxSpeed = maxSpeed;
        this.color=color;
    }
}
