package basic.c10_extras;

/*
Clase 8 - Manejo de excepciones, depuración y extras (28/05/2025)
Vídeo: https://www.twitch.tv/videos/2471305243
*/

import basic.c08_oop.a01_Classes;
import basic.c08_oop.a02_Person;

import java.util.Scanner;
//import basic.c08_oop.*;

public class Extras {

    static String globalName = "Mi pito";

    public static void main(String[] args) {

        // Extras

        // null

        String name = "Brais";
        name = null;
        if (name != null) {
            System.out.println(name.toLowerCase());
        }

        // import

        new a02_Person("Brais", 18, "1");
        new a01_Classes();

        // Scanner

        var scanner = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        var age = scanner.nextInt();

        System.out.println("La edad es: " + age);

        // Scope: variables globales y locales

        test();

        // static: variables y métodos estáticos
        // static: se pueden usar sin instanciar la clase

    }

    public static void test() {
        System.out.println(globalName);
    }
}
