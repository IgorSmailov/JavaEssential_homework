package Homework_04_task_01;

public class DOCHandler extends AbstractHandler{
    @Override
    public void open() {
        System.out.println("Document open");
    }

    @Override
    public void create() {
        System.out.println("Document create");
    }

    @Override
    public void change() {
        System.out.println("Document change");
    }

    @Override
    public void save() {
        System.out.println("Document save");
    }
}
