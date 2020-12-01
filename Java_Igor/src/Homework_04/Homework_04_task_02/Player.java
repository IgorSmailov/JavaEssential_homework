package Homework_04_task_02;

public class Player implements Playable, Recodable {

    public String getPlayerType() {
        return playerType;
    }

    private String playerType;

public Player(String playerType){
    this.playerType = playerType;
}

    @Override
    public void play() {
        System.out.println("Play track!");
    }

    @Override
    public void record() {
        System.out.println("Record track!");
    }

    @Override
    public void pause() {
        System.out.println("Pause track!");
    }

    @Override
    public void stop() {
        System.out.println("Stop track!");
    }
}
