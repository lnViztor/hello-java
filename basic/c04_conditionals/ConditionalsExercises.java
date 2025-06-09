package basic.c04_conditionals;

/*
Clase 3 - Strings, Condicionales y Arrays (17/04/2025)
Vídeo: https://www.twitch.tv/videos/2436086584
*/

public class ConditionalsExercises {

    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        int userAge = 20; // Cambia este valor para probar
        if (userAge >= 18) {
            System.out.println("El usuario puede votar.");
        } else {
            System.out.println("El usuario no puede votar.");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        int num1 = 10; // Cambia este valor para probar
        int num2 = 15; // Cambia este valor para probar
        if (num1 > num2) {
            System.out.println("El número " + num1 + " es mayor que " + num2);
        } else if (num1 < num2) {
            System.out.println("El número " + num2 + " es mayor que " + num1);
        } else {
            System.out.println("Los números son iguales.");
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.
        int number = -5; // Cambia este valor para probar
        if (number > 0) {
            System.out.println("El número " + number + " es positivo.");
        } else if (number < 0) {
            System.out.println("El número " + number + " es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        // 4. Crea un programa que diga si un número es par o impar.
        int evenOddNumber = 7; // Cambia este valor para probar
        if (evenOddNumber % 2 == 0) {
            System.out.println("El número " + evenOddNumber + " es par.");
        } else {
            System.out.println("El número " + evenOddNumber + " es impar.");
        }

        // 5. Verifica si un número está en el rango de 1 a 100.
        int rangeNumber = 50; // Cambia este valor para probar
        if (rangeNumber >= 1 && rangeNumber <= 100) {
            System.out.println("El número " + rangeNumber + " está en el rango de 1 a 100.");
        } else {
            System.out.println("El número " + rangeNumber + " no está en el rango de 1 a 100.");
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        int dayOfWeek = 3; // Cambia este valor para probar
        switch (dayOfWeek) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número de día inválido.");
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
        float grade = 95.5f; // Cambia este valor para probar
        if (grade >= 90) {
            System.out.println("Sobresaliente");
        }else if (grade >= 70 && grade < 90) {
            System.out.println("Notable");
        } else if (grade >= 60 && grade < 70) {
            System.out.println("Bien");
        } else if (grade >= 50 && grade < 60) {
            System.out.println("Suficiente");
        } else {
            System.out.println("Suspenso");
        }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        int ageForCinema = 14; // Cambia este valor para probar
        boolean accompanied = true; // Cambia este valor para probar
        if (ageForCinema >= 15 || accompanied) {
            System.out.println("Puedes entrar al cine.");
        } else {
            System.out.println("No puedes entrar al cine.");
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante.
        char letter = 'a'; // Cambia este valor para probar
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ||
            letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
            System.out.println("La letra '" + letter + "' es una vocal.");
        } else {
            System.out.println("La letra '" + letter + "' es una consonante.");
        }

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
        int a = 5; // Cambia este valor para probar
        int b = 10; // Cambia este valor para probar
        int c = 3; // Cambia este valor para probar
        if (a >= b && a >= c) {
            System.out.println("El mayor es: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("El mayor es: " + b);
        } else {
            System.out.println("El mayor es: " + c);
        }

    }
}
