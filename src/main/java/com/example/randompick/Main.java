package com.example.randompick;


import com.example.randompick.model.Player;
import com.example.randompick.view.*;

import java.util.InputMismatchException;

public class Main {
    static InputView inputView = new InputConsoleView();
    static OutputView outputViewr = new OutputConsoleView();

    public static void main(String[] args) throws Exception {
        Player player = new Player();
        GameMachine gameMachine = new GameMachine();

        outputViewr.printStartManual();
        int gameCount = inputView.inputGameCount();

        GameResult memberList = player.play(gameMachine, gameCount);
        outputViewr.printGameResult(memberList);
    }
}
