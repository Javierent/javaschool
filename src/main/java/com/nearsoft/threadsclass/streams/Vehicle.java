package main.java.com.nearsoft.threadsclass.streams;

public class Vehicle {

    private VehicleType type;
    private String licensePlates;
    private String color;
    private int maxPassengers;

    Vehicle(VehicleType type, String licensePlates, String color) {
        this.type = type;
        this.licensePlates = licensePlates;
        this.color = color;
        this.maxPassengers = 5;
    }

    Vehicle(VehicleType type, String licensePlates, String color, int maxPassengers) {
        this.type = type;
        this.licensePlates = licensePlates;
        this.color = color;
        this.maxPassengers = maxPassengers;
    }

    VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    String getLicensePlates() {
        return licensePlates;
    }

    public void setLicensePlates(String licensePlates) {
        this.licensePlates = licensePlates;
    }

    String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type=" + type +
                ", licensePlates='" + licensePlates + '\'' +
                ", color='" + color + '\'' +
                ", maxPassengers=" + maxPassengers +
                '}';
    }


}
