package com.learn.DesignPatterns.Behavioural.State.MusicPlayerExample;

public class MusicPlayer {
    // This is the context class. It has a reference to State interface
    private PlayerStates state;

    public void setState(PlayerStates state) {
        this.state = state;
    }
    public void pressPlay() {
        state.pressPlay();
    }
    public  void pressPause() {
        state.pressPause();
    }

    public void pressStop() {
        state.pressStop();
    }
}
