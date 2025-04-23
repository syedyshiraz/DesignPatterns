package StructuralDesignPatterns.AdapterDesignPattern.MediaPlayer;

public class MKVPlayer implements IPlayer{

    @Override
    public void play(){
        System.out.println("Playing .mkv file");
    }
}
