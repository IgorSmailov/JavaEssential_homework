package Homework_02.Task01_Additional;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please add radius: =");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        System.out.println("Area of Circle: =" +MyArea.areaOfCircle(radius));
    }
}
