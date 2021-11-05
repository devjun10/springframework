package com.example.randompick;


import com.example.randompick.model.Member;
import com.example.randompick.model.Members;
import com.example.randompick.view.GameResult;

import java.util.List;

public class GameMachine {
    public GameResult play(int gameCount) {
        List<Member> shuffledMembers = getShuffledMembers(gameCount);
        return GameResult.of(shuffledMembers);
    }

    /**
     * 클래스 멤버 데이터 초기화
     * */
    static {
        Init init = new Init();
    }

    public List<Member> getShuffledMembers(int count){
        return Members.of().getShuffledMembers(count);
    }
}