package com.example.randompick.model;

import com.example.randompick.ErrorMessage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Members {
    private static final int MIN_MEMBER_SIZE = 1;
    private static final int MEMBER_SIZE = 34;
    public static final List<Member> list = new ArrayList<>();

    public List<Member> getShuffledMembers(int number) {
        validateNumber(number);
        validateSize(list);

        List<Member> copyMembers = new ArrayList<>(list);
        Collections.shuffle(copyMembers);
        return copyMembers.subList(0, number);
    }

    public static Members of() {
        return new Members();
    }

    private void validateSize(List<Member> members) {
        if (members.size() != MEMBER_SIZE) {
            throw new IllegalArgumentException("전체 회원 수가 맞지 않습니다.");
        }
    }

    private void validateNumber(int number) {
        if (number < MIN_MEMBER_SIZE) {
            throw new IllegalArgumentException(ErrorMessage.LOWER_THAN_MIN_SIZE.toString());
        }
        if (number > MEMBER_SIZE) {
            throw new IllegalArgumentException(ErrorMessage.OVER_THAN_MAX_SIZE.toString());
        }
    }
}
