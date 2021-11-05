package com.example.randompick;

public enum ErrorMessage {
    INVALID_TYPE("올바른 타입을 입력해주세요"),
    INVALID_RANGE("최소 한 명 이상, 최대 수 보다 작은 값을 입력해주세요"),
    LOWER_THAN_MIN_SIZE("최소 한 명 이상의 회원을 입력해주세요."),
    OVER_THAN_MAX_SIZE("올바른 회원수를 입력해주세요.");

    private final String description;

    ErrorMessage(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
