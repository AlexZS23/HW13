import java.util.Scanner;

public class CheckData {

//    Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
//    Login должен содержать только латинские буквы, цифры и знак подчеркивания.
//    Длина login должна быть меньше 20 символов. Если login не соответствует этим требованиям, необходимо выбросить
//    WrongLoginException. Password должен содержать только латинские буквы, цифры и знак подчеркивания.
//    Длина password должна быть меньше 20 символов. Также password и confirmPassword должны быть равны.
//    Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.

//    Обработка исключений проводится внутри метода. Используем multi-catch block.
//    Метод возвращает true, если значения верны или false в другом случае.

    private static boolean isDataCorrect(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (!login.matches("[a-zA-Z0-9_]+") || login.length() > 20) {
            throw new WrongLoginException("Your login is incorrect.");
        } else if (!password.matches("[a-zA-Z0-9_]+") ||
                !confirmPassword.matches("[a-zA-Z0-9_]+") ||
                password.length() > 20 ||
                !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Your password is incorrect.");
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Login:");
        String login = scanner.nextLine();

        System.out.println("Enter your Password:");
        String password = scanner.nextLine();

        System.out.println("Please confirm your Password:");
        String confirmPassword = scanner.nextLine();

        try {
            isDataCorrect(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException wrongData) {
            wrongData.printStackTrace();
        }
    }
}

