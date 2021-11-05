package com.example.randompick;


import com.example.randompick.model.Member;
import com.example.randompick.model.Members;
import com.example.randompick.model.Name;

import java.util.List;

public class Init {
    private static final int MIN_MEMBER_SIZE = 0;
    private static final int MAX_MEMBER_SIZE = 34;
    private static final List<String> nameList = List.of(
            "Barney", "BC", "Bart", "Dave", "David", "Dike", "donggi", "Hanse", "Head", "hoo", "Jarry", "Jerry",
            "Jhin", "Jun", "Konda", "Lacon", "Mandoo", "meatsby", "Mk", "mong", "OS", "Phill",
            "sonny", "tasku", "Tany", "Teemo", "Yan", "young", "검봉", "노리", "땃쥐", "반스", "피오", "호두마루");

    static {
        for (int i = MIN_MEMBER_SIZE; i < MAX_MEMBER_SIZE; i++) {
            Members.list.add(new Member(i, new Name(nameList.get(i))));
        }
    }
}
