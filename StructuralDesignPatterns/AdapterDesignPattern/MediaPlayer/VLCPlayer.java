package StructuralDesignPatterns.AdapterDesignPattern.MediaPlayer;

public class VLCPlayer {
    MP4Player mp4Player;

    public VLCPlayer(MP4Player mp4Player){
        this.mp4Player = mp4Player;
    }

    public void play(){
        System.out.println("Playing mp4 file");
        mp4Player.play();
    }
}
