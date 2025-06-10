package src.utils;

public class Validator {
    public static boolean isValidLogin(String username, String password) {
        return !(username == null || username.isEmpty() || password == null || password.isEmpty());
    }

    public static boolean isValidEmail(String email) {
        return email.matches("^(.+)@(.+)$");
    }

    public static boolean isNumeric(String input) {
        return input.matches("\\d+");
    }
}
