package Homework_003_01;

public class BadPupil extends Pupil{
    @Override
    public void study() {
        System.out.println("Studying Bad! ");
    }

    @Override
    public void read() {
        System.out.println("Reading Bad! ");
    }

    @Override
    public void write() {
        System.out.println("Writing Bad! ");
    }

    @Override
    public void relax() {
        System.out.println("Relaxing Bad! ");
    }
}
