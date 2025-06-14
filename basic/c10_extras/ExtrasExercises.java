package basic.c10_extras;

/*
Clase 8 - Manejo de excepciones, depuración y extras (28/05/2025)
Vídeo: https://www.twitch.tv/videos/2471305243
*/

import java.util.Random;
public class ExtrasExercises {

    public static void main(String[] args) {

        // 1. Crea una variable de tipo String inicializada como null y verifica que no esté vacía antes de usarla.
        var name = (String) null;
        if (name != null) {
            System.out.println(name.toLowerCase());
        } else {
            System.out.println("La variable 'name' es null.");
        }

        // 2. Escribe un programa que lea el nombre y edad del usuario usando Scanner.
        //    Luego, muestra un mensaje con el nombre y la edad.
        var scanner = new java.util.Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String userName = scanner.nextLine();
        System.out.print("Introduce tu edad: ");
        int userAge = scanner.nextInt();
        System.out.println("Hola " + userName + ", tienes " + userAge + " años.");


        // 3. Declara una constante final llamada MAX_SCORE con valor 100 y muéstrala.
        final int MAX_SCORE = 100;
        System.out.println("La puntuación máxima es: " + MAX_SCORE);

        // 4. Crea una variable global message y otra local message dentro del método main(). Muestra ambas.
        String globalMessage = "Mensaje global";
        String message = "Mensaje local dentro de main()";
        System.out.println("Mensaje global: " + globalMessage);
        System.out.println("Mensaje local: " + message);

        // 5. Usa import java.util.Scanner; para leer un número y mostrar si es positivo o negativo.
        System.out.print("Introduce un número: ");
        int number = scanner.nextInt();
        if (number >= 0) {
            System.out.println("El número " + number + " es positivo.");
        } else {
            System.out.println("El número " + number + " es negativo.");
        }

        // 6. Declara una variable static en una clase y accede a ella desde main() sin crear un objeto.
        //    Crea una clase llamada StaticExample con una variable estática.
        class StaticExample {
            static String staticMessage = "Mensaje estático";
        }
        System.out.println("Accediendo a la variable estática: " + StaticExample.staticMessage);

        // 7. Importa java.util.Random y genera un número aleatorio del 1 al 10.
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1; // Genera un número entre 1 y 10
        System.out.println("Número aleatorio generado: " + randomNumber);

        // 8. Crea una clase con comentarios adecuados explicando cada sección del código.
        //    Por ejemplo, una clase llamada CommentedClass con un método que imprima un mensaje.
        class CommentedClass {
            // Este método imprime un mensaje en la consola
            public void printMessage() {
                System.out.println("Este es un mensaje de la clase CommentedClass.");
            }
        }
        CommentedClass commentedClass = new CommentedClass();
        commentedClass.printMessage();


        // 9. Define una clase User con una constante APP_NAME, una variable global username y una función que imprima ambas.
        class User {
            // Constante de la aplicación
            public static final String APP_NAME = "Mi Aplicación";
            // Variable global del usuario
            public String username;

            // Constructor para inicializar el nombre de usuario
            public User(String username) {
                this.username = username;
            }

            // Método para imprimir el nombre de la aplicación y el nombre de usuario
            public void printInfo() {
                System.out.println("Aplicación: " + APP_NAME);
                System.out.println("Usuario: " + username);
            }
        }
        //Ejecutando la clase User
        User user = new User("Brais");
        user.printInfo();

        // 10. Haz debug del código implementado haciendo uso de sus diferentes herramientas.
    }
}
