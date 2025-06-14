package basic.c09_exceptions;

/*
Clase 8 - Manejo de excepciones, depuración y extras (28/05/2025)
Vídeo: https://www.twitch.tv/videos/2471305243
*/

public class ExceptionsExercises {

    public static void main(String[] args) {

        // 1. Divide dos números almacenados en dos variables. Maneja la división por cero con try-catch.
        try {
            int a = 10;
            int b = 0; // Cambia este valor para probar la división por cero
            int result = a / b;
            System.out.println("Resultado: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero no permitida.");
        }

        // 2. Crea un array de 3 elementos e intenta acceder al índice 5. Captura el ArrayIndexOutOfBoundsException.
        try {
            int[] array = {1, 2, 3};
            System.out.println("Elemento en índice 5: " + array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de los límites del array.");
        }

        // 3. Crea una variable String nula e intenta imprimir su longitud. Maneja el NullPointerException.
        try {
            String str = null; // Cambia este valor para probar el NullPointerException
            System.out.println("Longitud de la cadena: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("Error: La cadena es nula, no se puede calcular su longitud.");
        }

        // 4. Escribe una función que transforma texto a número. Usa try-catch para manejar entradas no válidas (NumberFormatException).
        try {
            String numberString = "123a"; // Cambia este valor para probar el NumberFormatException
            int number = Integer.parseInt(numberString);
            System.out.println("Número convertido: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: La cadena no es un número válido.");
        }

        // 5. Escribe un programa con un bloque finally que se ejecute siempre, haya o no error.
        try {
            System.out.println("Intentando ejecutar código...");
            // Aquí podrías poner código que podría lanzar una excepción
        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e.getMessage());
        } finally {
            System.out.println("Este bloque se ejecuta siempre, independientemente de si hubo un error o no.");
        }

        // 6. Usa throw para lanzar un IllegalArgumentException si un número introducido es negativo.
        try {
            int number = -5; // Cambia este valor para probar el IllegalArgumentException
            if (number < 0) {
                throw new IllegalArgumentException("El número no puede ser negativo.");
            }
            System.out.println("Número válido: " + number);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 7. Crea una clase TemperatureChecker que lanza una excepción personalizada si la temperatura es menor a -50 o mayor a 50.
        try {
            TemperatureChecker.checkTemperature(60); // Cambia este valor para probar la excepción personalizada
        } catch (TemperatureChecker e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 8. Crea un programa con varios bloques catch: uno para ArithmeticException, otro para ArrayIndexOutOfBoundsException.
        try {
            int[] numbers = {1, 2, 3};
            int result = 10 / 0; // Esto lanzará ArithmeticException
            System.out.println("Resultado: " + result);
            System.out.println("Elemento en índice 5: " + numbers[5]); // Esto lanzará ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero no permitida.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de los límites del array.");
        }

        // 9. Crea una función checkPassword(String pass) que lance una excepción si la contraseña es demasiado corta.

        try {
            checkPassword("123"); // Cambia este valor para probar la excepción
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


        // 10. Implementa una clase LoginSystem que use una excepción personalizada LoginFailedException si el usuario o contraseña son incorrectos.
        try {
            LoginSystem.login("user", "wrongpassword"); // Cambia estos valores para probar la excepción
        } catch (LoginFailedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    private static void checkPassword(String pass) throws Exception {
        if (pass.length() < 6) {
            throw new Exception("La contraseña debe tener al menos 6 caracteres.");
        } else {
            System.out.println("Contraseña válida.");
        }
    }
}
