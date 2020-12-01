package Homework_04_task_01;

public class XMLHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("XML Document open");
    }

    @Override
    public void create() {
        System.out.println("XML Document create");
    }

    @Override
    public void change() {
        System.out.println("XML Document change");
    }

    @Override
    public void save() {
        System.out.println("XML Document save");
    }
}
