package Homework_003_02;

public class Main {
    public static void main(String[] args) {

        Plane plane = new Plane(600000,880,2018,11000,320);
        Ship ship = new Ship(120000,160,1996,50,"Odessa");
        Cars car = new Cars(30000,220,2019);

        System.out.println(ship.toString());
        System.out.println(plane.toString());
        System.out.println(car.toString());
    }
}
