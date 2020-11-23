package Homework_02.Task04;

public class Car {

    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car() {
        this.year =2020;
        this.speed = 260;
        this.color = "Black";
    }

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, double speed) {
        this.year = 2016;
        this.speed = speed;
    }

    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = 190;
        this.weight = 1950;
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
}
