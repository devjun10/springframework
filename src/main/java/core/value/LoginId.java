package core.value;

import java.util.Objects;

public class LoginId {

    private final String loginId;

    public LoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginId() {
        return loginId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LoginId)) return false;
        LoginId loginId1 = (LoginId) o;
        return getLoginId().equals(loginId1.getLoginId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLoginId());
    }

    @Override
    public String toString() {
        return loginId;
    }
}
