package Homework_003_01;

public class GoodPupil extends Pupil{
    @Override
    public void study() {
        System.out.println("Studying Good!");
    }

    @Override
    public void read() {
        System.out.println("Reading Good!");
    }

    @Override
    public void write() {
        System.out.println("Writing Good!");
    }

    @Override
    public void relax() {
        System.out.println("Relaxing Good!");
    }
}
