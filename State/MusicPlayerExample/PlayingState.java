package com.learn.DesignPatterns.Behavioural.State.MusicPlayerExample;

public class PlayingState implements PlayerStates{
    @Override
    public void pressPlay() {
        System.out.println("Already playing");
    }

    @Override
    public void pressPause() {
        System.out.println("Pause the song");
    }

    @Override
    public void pressStop() {
        System.out.println("Stop the song");
    }
}
