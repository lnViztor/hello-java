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

        // 4. Escribe una función que transforma texto a número. Usa try-catch para manejar entradas no válidas (NumberFormatException).

        // 5. Escribe un programa con un bloque finally que se ejecute siempre, haya o no error.

        // 6. Usa throw para lanzar un IllegalArgumentException si un número introducido es negativo.

        // 7. Crea una clase TemperatureChecker que lanza una excepción personalizada si la temperatura es menor a -50 o mayor a 50.

        // 8. Crea un programa con varios bloques catch: uno para ArithmeticException, otro para ArrayIndexOutOfBoundsException.

        // 9. Crea una función checkPassword(String pass) que lance una excepción si la contraseña es demasiado corta.

        // 10. Implementa una clase LoginSystem que use una excepción personalizada LoginFailedException si el usuario o contraseña son incorrectos.
    }
}
