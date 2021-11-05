package com.example.randompick.model;


import com.example.randompick.GameMachine;
import com.example.randompick.view.GameResult;

public class Player {
    public GameResult play(GameMachine gameMachine, int gameCount) {
        return gameMachine.play(gameCount);
    }
}
