package basic.c09_exceptions;

public class LoginSystem {
    // 10. Implementa una clase LoginSystem que use una excepción personalizada LoginFailedException si el usuario o contraseña son incorrectos.
    public static void login(String username, String password) throws LoginFailedException {
        String correctUsername = "user";
        String correctPassword = "password";

        if (!username.equals(correctUsername) || !password.equals(correctPassword)) {
            throw new LoginFailedException("Usuario o contraseña incorrectos.");
        } else {
            System.out.println("Inicio de sesión exitoso.");
        }
    }

}
