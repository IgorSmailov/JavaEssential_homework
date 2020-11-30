package Homework_003_02;

public class Vehicle {
    private double price;
    private int speed;
    private int yearOfProductRelease;

    public Vehicle(double price, int speed, int yearOfProductRelease) {
        this.price = price;
        this.speed = speed;
        this.yearOfProductRelease = yearOfProductRelease;
    }

    public double getPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }

    public int getYearOfProductRelease() {
        return yearOfProductRelease;
    }
}
