package basic.c00_helloworld;

/*
Clase 2 - Comentarios, Variables, Constantes, Tipos de datos y Operadores (09/04/2025)
Vídeo: https://www.twitch.tv/videos/2428998601
*/

public class HelloWorldExercises {

    public static void main(String[] args) {

        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".
        System.out.println("Hola mundo, Java!");

        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.
        System.out.println("Hola\nMundo");

        // 3. Añade un comentario sobre lo que hace cada línea del programa.

        // Este programa imprime un saludo en la consola.


        // 4. Crea un comentario en varias líneas.
        /*
        Este es un comentario
        en varias líneas.
         */


        // 5. Imprime tu edad, tu color favorito y tu ciudad.
        System.out.println("Tengo 25 años.");
        System.out.println("Mi color favorito es el azul.");
        System.out.println("Vivo en Madrid.");

        // 6. Explora los diferentes System.XXX.println(); más allá de "out".
        // Puedes usar System.err para imprimir mensajes de error.
        System.err.println("Este es un mensaje de error.");
        // También puedes usar System.out.printf para formatear la salida.
        System.out.printf("Hola, %s! Tienes %d años.\n", "Juan", 25);

        // 7. Utiliza varios println para imprimir una frase.
        System.out.println("Hola,");
        System.out.println("¿Cómo estás?");
        System.out.println("Espero que estés bien.");
        // Puedes usar un solo println con \n para imprimir varias líneas.
        // System.out.println("Hola,\n¿Cómo estás?\nEspero que estés bien.");
        // También puedes usar System.out.print para imprimir sin salto de línea.
        // System.out.print("Hola, ");
        // System.out.print("¿Cómo estás? ");
        // System.out.print("Espero que estés bien.");
        // También puedes usar System.out.printf para formatear la salida.


        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).
        System.out.println("  ^_^  ");

        // 9. Intenta ejecutar el programa sin el metodo main y observa el error.
        // El metodo main es el punto de entrada del programa. Sin él, no se puede ejecutar.

        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?
        // El nombre del archivo debe coincidir con el nombre de la clase pública.


    }
}