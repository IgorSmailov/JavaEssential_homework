package Homework_06.task04;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(22);
        numbers.add(32);
        numbers.add(42);
        numbers.add(52);
        numbers.add(62);

        System.out.println("Numbers list before iteration increasing +1 =" +numbers);

        ListIterator<Integer> iterator =  numbers.listIterator();
        int i=0;
        for (int numbersInc: numbers){
            numbers.set(i,iterator.next()+1);
            i++;
        }
        System.out.println("Numbers list after increasing =" +numbers);
    }
}
