package Homework_06;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
       ArrayList <String> zoo = new ArrayList<>();
        zoo.add("Lion");
        zoo.add("Panda");
        zoo.add("Tiger");
        zoo.add("Dophin");
        zoo.add("Elephant");
        zoo.add("Panthera");
        zoo.add("Gorilla");
        zoo.add("Monkey");

        for (String animal: zoo){
            System.out.println(animal);
        }
        System.out.println("Animals in zoo: " +zoo);

        System.out.println("Animals list before removal: " +zoo);

        zoo.remove(6);
        zoo.remove(4);
        zoo.remove(2);

        System.out.println("Animals list after removal: " +zoo);
    }

}
