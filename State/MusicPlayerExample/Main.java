package com.learn.DesignPatterns.Behavioural.State.MusicPlayerExample;

public class Main {
    public static void main(String[] args) {
        MusicPlayer myPlayer = new MusicPlayer();
        myPlayer.setState(new PlayingState());
        myPlayer.pressPlay();
        myPlayer.pressPause();
        myPlayer.pressStop();

    }
}
