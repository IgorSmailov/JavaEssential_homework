package com.itvdn.javaProfessional.Home_Additional;

public class Clazz2 extends Thread {
    private String name;
    private int count;

    public Clazz2(String name, int count) {
        this.name = name;
        this.count = count;
    }


    public void run() {
        try {

            Thread.sleep(2000);
            for (int i = 1; i < count + 1; i++) {
                System.out.println(name + " " + (i));
                { ;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}