package com.example.randompick.view;

import com.example.randompick.Message;

public class OutputConsoleView implements OutputView {
    @Override
    public void printStartManual() {
        System.out.println(Message.QUESTION);
    }

    @Override
    public void printGameResult(GameResult gameResult) {
        gameResult.getMembers()
                .forEach(member -> System.out.println(member.getName()));
    }

    @Override
    public void askGameContinue() {
        System.out.println(Message.ASK_CONTINUOUS);
    }
}
