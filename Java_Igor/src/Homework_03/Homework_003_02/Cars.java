package Homework_003_02;

public class Cars  extends Vehicle{

    public Cars(double price, int speed, int yearOfProductRelease) {
        super(price, speed, yearOfProductRelease);
    }

    @Override
    public String toString() {
        return " Car (" +
                "Price: " +getPrice()  + ", " +
                "Speed: " +getSpeed() + ", " +
                "Year of Production: " +getYearOfProductRelease() +") "  ;
    }
}
