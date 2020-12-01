package Homework_04_task_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Specify the document option:");
        System.out.println("1 - .DOC, \n2 - .XML, \n3 - .TXT");

       Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();

        switch (key) {
            case 1:
                DOCHandler docHandler = new DOCHandler();
                docHandler.open();
                docHandler.create();
                docHandler.change();
                docHandler.save();
                break;

            case 2:
                XMLHandler xml = new XMLHandler();
                xml.open();
                xml.create();
                xml.change();
                xml.save();

                break;
            case 3:
                TXTHandler txt = new TXTHandler();
                txt.open();
                txt.create();
                txt.change();
                txt.save();
                break;
        }
    }

}

