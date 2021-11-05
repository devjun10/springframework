package com.example.randompick;

public enum Message {
    LINE("------------------------------------------------------------------------"),
    QUESTION("몇 명의 클래스 멤버를 랜덤으로 출력하고 싶은지 입력해주세요."),
    ASK_CONTINUOUS("게임을 더 진행 하시겠습니까? 게임을 더 진행하길 원하면 숫자를, 게임을 종료하길 원하면 q를 눌러주세요."),
    ENTER("\n");
    private final String description;

    Message(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}
