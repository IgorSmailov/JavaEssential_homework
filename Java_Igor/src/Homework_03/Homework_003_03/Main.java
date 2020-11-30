package Homework_003_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Specify the access option:");
        System.out.println("#1 - EXPERT Mode | 2 - PRO Mode | 3 - TRIAL = I do not have a key");

        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();

        switch (key) {
            case 1:
                DocumentWorker expertDoc = new ExpertDocumentWorker();
                expertDoc.openDocument();
                expertDoc.editDocument();
                expertDoc.saveDocument();
                break;

            case 2:
                DocumentWorker proDoc = new ProDocumentWorker();
                proDoc.openDocument();
                proDoc.editDocument();
                proDoc.saveDocument();
                break;
            case 3:
                DocumentWorker docWorker = new DocumentWorker();
                docWorker.openDocument();
                docWorker.editDocument();
                docWorker.saveDocument();
                break;
        }
    }

    }
