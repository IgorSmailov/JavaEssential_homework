package Homework_003_01;

public class Main {
    public static void main(String[] args) {

        Pupil pupil1 = new ExcelentPupil();
        Pupil pupil2 = new GoodPupil();
        Pupil pupil3 = new BadPupil();
        Pupil pupil4 = new GoodPupil();

        ClassRoom classRoom = new ClassRoom(pupil1, pupil2, pupil3, pupil4);

        Pupil[] pupils = {pupil1, pupil2, pupil3, pupil4};

        for (Pupil pupil: pupils ){
            pupil.study();
            pupil.read();
            pupil.write();
            pupil.relax();
            System.out.println("Pupil #" +pupil);
        }

    }
}
