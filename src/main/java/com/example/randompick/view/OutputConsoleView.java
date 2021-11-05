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
        System.out.println("게임을 더 진행 하시겠습니까? 게임을 더 진행하길 원하면 숫자를, 게임을 종료하길 원하면 q를 눌러주세요.");
    }
}
