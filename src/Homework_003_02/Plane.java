package Homework_003_02;

public class Plane extends Vehicle {
    private int flightAltitude;

    public int getFlightAltitude() {
        return flightAltitude;
    }

    public int getPassengersCount() {
        return passengersCount;
    }

    private int passengersCount;

    public Plane(double price, int speed, int yearOfProductRelease, int flightAltitude, int passengersCount) {
        super(price, speed, yearOfProductRelease);
        this.flightAltitude = flightAltitude;
        this.passengersCount = passengersCount;
    }

    @Override
    public String toString() {
        return "Plane (" +
                "Year of production: " + getYearOfProductRelease() + ", " +
                "Price: " +getPrice()+ ", " +
                "Flight Height(attitude): " + getFlightAltitude() + ", " +
                "Speed: " + getSpeed() + ", " +
                "Passengers Count=" + getPassengersCount() + ")";
    }
}
