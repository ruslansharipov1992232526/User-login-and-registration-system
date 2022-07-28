import java.util.HashMap;
import java.util.Random;
public class StorrageUser {
    public static Random random = new Random();

    public static HashMap<String, UserSignIn> userSignInStorage = new HashMap<>();

    public static void addUser(String userName, String userMail, String userPhone, String userPass) {
        int RAND = random.nextInt(10000000);
        userSignInStorage.put(String.valueOf(RAND), new UserSignIn(userName, userMail, userPhone, userPass));
    }


}
