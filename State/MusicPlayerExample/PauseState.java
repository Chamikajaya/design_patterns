package com.learn.DesignPatterns.Behavioural.State.MusicPlayerExample;

public class PauseState implements PlayerStates{
    @Override
    public void pressPlay() {
        System.out.println("Play the song");
    }

    @Override
    public void pressPause() {
        System.out.println("Already paused");
    }

    @Override
    public void pressStop() {
        System.out.println("Stop the song");
    }
}
