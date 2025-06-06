package basic.c02_operators;

/*
Clase 2 - Comentarios, Variables, Constantes, Tipos de datos y Operadores (09/04/2025)
Vídeo: https://www.twitch.tv/videos/2428998601
*/

public class OperatorsExercises {

    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.
        //  Imprime el resultado de cada operación.
        //  Por ejemplo:
        var suma = 5 + 3; System.out.println(suma);


        // 2. Crea una variable para cada tipo de operación de asignación.
        //  Imprime el resultado de cada operación.
        //  Por ejemplo:
        var a = 5;
        var b = 3;
        a = b; System.out.println(a);
        a = b * 2; System.out.println(a);
        a += 1; System.out.println(a); // a = a + 1
        a -= 1; System.out.println(a); // a = a - 1
        a *= 2; System.out.println(a); // a = a * 2
        a /= 2; System.out.println(a); // a = a / 2
        a %= 2; System.out.println(a); // a = a % 2


        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        System.out.println(5 == 5); // true
        System.out.println(5 != 3); // true
        System.out.println(5 > 3); // true


        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println(5 == 3); // false
        System.out.println(5 != 5); // false
        System.out.println(5 < 3); // false

        // 5. Utiliza el operador lógico and.
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false

        // 6. Utiliza el operador lógico or.
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false

        // 7. Combina ambos operadores lógicos.
        System.out.println(true && (true || false)); // true

        // 8. Añade alguna negación.
        System.out.println(!true); // false
        System.out.println(!false); // true


        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        var x = 5;
        System.out.println(++x); // 6
        System.out.println(--x); // 5
        System.out.println(x++); // 5
        System.out.println(x); // 6
        System.out.println(x--); // 6
        System.out.println(x); // 5

        // 10. Combina operadores aritméticos, de comparación y lógicos.
        var y = 10;
        var z = 5;
        System.out.println((y + z) > 10 && (y - z) < 10); // true
    }
}
