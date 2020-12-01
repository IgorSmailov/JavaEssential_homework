package Homework_04_task_01;

public class TXTHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("TXT Document open");
    }

    @Override
    public void create() {
        System.out.println("TXT Document create");
    }

    @Override
    public void change() {
        System.out.println("TXT Document change");
    }

    @Override
    public void save() {
        System.out.println("TXT Document save");
    }
}
