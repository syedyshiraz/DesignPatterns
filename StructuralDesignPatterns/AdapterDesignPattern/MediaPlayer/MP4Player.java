package StructuralDesignPatterns.AdapterDesignPattern.MediaPlayer;

public class MP4Player implements IConverter, IPlayer{

    private IPlayer player;

    public MP4Player(IPlayer player){
        this.player = player;
    }

    @Override
    public void convertAndPlay() {
        player.play();
    }

    @Override
    public void play() {
        System.out.println("converting mp4 to mkv");
        convertAndPlay();
    }
    
}
