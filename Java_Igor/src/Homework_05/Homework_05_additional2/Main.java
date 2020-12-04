package Homework_05_additional2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Teacher> arrayList = new ArrayList<>();
        Teacher teacher1 = new Teacher("Sergey", "Nikolayevich");
        Teacher teacher2 = new Teacher("Larisa", "Ivanovna");
        Teacher teacher3 = new Teacher("Nikolay", "Ivanovich");
        Teacher teacher4 = new Teacher("Anton", "Sergeenko");

        arrayList.add(teacher1);
        arrayList.add(teacher2);
        arrayList.add(teacher3);
        arrayList.add(teacher4);

        System.out.print("Bad Teacher Index: ");
        System.out.println(arrayList.indexOf(teacher2));
        System.out.println("Bad Teacher Name = " +teacher2.getUsername() +" "  +teacher2.getSurname() );

        System.out.print("Best Teacher Index: ");
        System.out.println(arrayList.lastIndexOf(teacher4));
        System.out.println("Best Teacher Name = "  +teacher4.getUsername() +" "  +teacher4.getSurname() );
    }
}
