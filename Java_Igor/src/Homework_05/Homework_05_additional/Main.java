package Homework_05_additional;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Sergey Nikolayevich");
        arrayList.add("Larisa Alexandrova");
        arrayList.add("Nikolay Ivanovich");
        arrayList.add("Petr Igorevich");

        System.out.println(arrayList);

        System.out.print("Bad Teacher Index: ");
        System.out.println(arrayList.indexOf("Larisa Alexandrova"));
        System.out.println("Bad Teacher Name = " +"Larisa Alexandrova");

        System.out.print("Best Teacher Index: ");
        System.out.println(arrayList.lastIndexOf("Petr Igorevich"));
        System.out.println("Best Teacher Name = " +"Petr Igorevich");
    }
}
