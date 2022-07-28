import java.util.HashMap;
import java.util.Objects;

public class UserSignIn {
    public static String userName;
    public String userMail;
    public String userPhone;
    public String userPass;

    public UserSignIn(String userName, String userMail, String userPhone, String userPass) {
        this.userName = userName;
        this.userMail = userMail;
        this.userPhone = userPhone;
        this.userPass = userPass;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !obj.getClass().equals(UserSignIn.class)) return false;
        UserSignIn userSignIn = (UserSignIn) obj;
        return userName.equals(userSignIn.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName);
    }

    @Override
    public String toString() {
        return  userName + " -> " + userMail + " -> " + userPhone + " -> " + userPass;
    }

}
