package Homework_02.Task03;

public class Car {
    private int year;
    private double speed;

    public Car(int year) {
        this.year = year;
    }

    private int weight;
    private String color;

    public Car (){
    }

    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
    }


    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }





}
