package core;

import core.value.Email;
import core.value.LoginId;
import core.value.Name;
import core.value.Password;

import java.util.Objects;

public class Member {

    private Long memberId;
    private LoginId loginId;
    private Password password;
    private Name name;
    private Email email;

    public Member(LoginId loginId, Password password, Name name, Email email) {
        this.loginId = loginId;
        this.password = password;
        this.name = name;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Member)) return false;
        Member member = (Member) o;
        return memberId.equals(member.memberId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId);
    }

    @Override
    public String toString() {
        return memberId.toString();
    }
}
