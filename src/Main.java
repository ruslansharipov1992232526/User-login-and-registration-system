import java.util.Map;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Для регистрации введите имя, почту, телефон, пароль");
            String input = scanner.nextLine();
            String[] storage = input.split(", ");
            String userN = storage[0];

            if (userN.equals("end")) {
                for (Map.Entry<String, UserSignIn> entry : StorrageUser.userSignInStorage.entrySet()) {
                    System.out.println(entry.getKey() + " => " + entry.getValue());
                }
                return;
            }

//            for (Map.Entry<String, UserSignIn> entry : StorrageUser.userSignInStorage.entrySet()) {
//                if (userN.equals(UserSignIn.userName)) {
//                    System.out.println("Такой пользователь уже есть");
//                }
//            }

            String userM = storage[1];
            String userP = storage[2];
            String userPa = storage[3];

            StorrageUser.addUser(userN, userM, userP, userPa);
            for (Map.Entry<String, UserSignIn> entry : StorrageUser.userSignInStorage.entrySet()) {
                System.out.println(entry.getKey() + " => " + entry.getValue());
            }
        }
    }
}
