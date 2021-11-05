package com.example.randompick;

public enum Message {
    LINE("------------------------------------------------------------------------"),
    QUESTION("몇 명의 클래스 멤버를 랜덤으로 출력하고 싶은지 입력해주세요."),
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
