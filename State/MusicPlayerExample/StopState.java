package com.learn.DesignPatterns.Behavioural.State.MusicPlayerExample;

public class StopState implements PlayerStates{
    @Override
    public void pressPlay() {
        System.out.println("Play the song");
    }

    @Override
    public void pressPause() {
        System.out.println("Pause the song");
    }

    @Override
    public void pressStop() {
        System.out.println("Already stopped");
    }
}
