package com.itvdn.javaEssential.ex_003_sorting.sorting_values;

public class Car implements Comparable<Car> {

    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    @Override
    public int compareTo(Car c) {
        int result = c.speed - this.speed;

        if (result == 0) {
            result = c.model.compareTo(this.model);
        }

        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                ", price=" + price +
                ", speed='" + speed + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}