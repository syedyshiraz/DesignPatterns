package StructuralDesignPatterns.AdapterDesignPattern.MediaPlayer;

public class Main {
    public static void main(String[] args) {
        MKVPlayer mkvPlayer = new MKVPlayer();
        MP4Player mp4Player = new MP4Player(mkvPlayer);
        VLCPlayer vlcPlayer = new VLCPlayer(mp4Player);

        vlcPlayer.play();
    }
}
