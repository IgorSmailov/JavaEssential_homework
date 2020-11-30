package Homework_003_02;

public class Ship extends Vehicle {
    private int passengersNumber;

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public String getPortHome() {
        return portHome;
    }

    private String portHome;

    public Ship(double price, int speed, int yearOfProductRelease, int passengersNumber, String portHome) {
        super(price, speed, yearOfProductRelease);
        this.passengersNumber = passengersNumber;
        this.portHome = portHome;
    }

    @Override
    public String toString() {
        return "Ship (" +
                "Passengers Number = " + passengersNumber + ", " +
                ", portHome= '" + portHome + ", " +
                "Price: " +getPrice() + ", " +
                "Speed: " +getSpeed()+ ", " +
                "Year of Production: " +getYearOfProductRelease()+ ")";
    }
}
