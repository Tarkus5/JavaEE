public class Validator {
    public static void emailValidator(String email) throws NotValidException {
        if (!email.contains("@") || !email.contains(".")) {
            throw new NotValidException("Password not valid");
        }
    }

    public static void passwordValidator(String password) throws NotValidException {
        if (password.length() < 8) {
            throw new NotValidException("Password not valid");
        }
    }

    public static void age(int age) throws NotValidException {
        if (age < 0) {
            throw new NotValidException("Age not valid");
        }
    }
}
