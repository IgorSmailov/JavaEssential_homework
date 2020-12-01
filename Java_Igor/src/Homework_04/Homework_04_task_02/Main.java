package Homework_04_task_02;

public class Main {
    public static void main(String[] args) {


        Player casset_player = new Player("Sony old cassete player");
        System.out.println("Play on: " +casset_player.getPlayerType());
        casset_player.play();
        casset_player.pause();
        casset_player.stop();

        System.out.println("..........\n");

        Player vinyl = new Player("Vinyl turntable pioneerRT_707");
        System.out.println("Recording on: " +vinyl.getPlayerType());
        vinyl.record();
        vinyl.stop();
        vinyl.pause();
        vinyl.play();
    }
}
