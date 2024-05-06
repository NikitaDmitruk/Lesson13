package TaskOne;

public class Authenticator {
    private String login;
    private String password;
    private String confirmPassword;

    public static boolean singIn(String login, String password, String confirmPassword) {
        try {
            if (!login.matches("^(?!.*\\s).{1,19}$")) {
                throw new WrongLoginException("Логин не должен содержать больше 20 символов и знак пробела!");
            }
            if (!password.matches("^(?=.*\\d)(?!.*\\s).{1,19}$")) {
                throw new WrongPasswordException("Пароль должен содержать хотябы одну цифру!" +
                                                 "\nПароль не должен содержать больше 20 символов и знак пробела!");
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароли не совпадают!");
            }
        } catch (WrongLoginException | WrongPasswordException exception) {
            exception.printStackTrace();
            return false;
        }
        return true;
    }
}
