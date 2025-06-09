package basic.c04_conditionals;

/*
Clase 3 - Strings, Condicionales y Arrays (17/04/2025)
Vídeo: https://www.twitch.tv/videos/2436086584
*/

public class Conditionals {

    public static void main(String[] args) {

        // Condicionales

        // if, else if, else

        var age = 18;

        System.out.println(age >= 18);

        if (age > 18) {
            System.out.println("El usuario es mayor de edad");
        } else if (age == 18) {
            System.out.println("El usuario acaba de cumplir 18");
        } else {
            System.out.println("El usuario es menor de edad");
        }
        // if ternario
        var isAdult = age >= 18 ? "El usuario es mayor de edad" : "El usuario es menor de edad";
        System.out.println(isAdult);



        // switch

        var day = 5;

        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("No es lunes, martes o miércoles");
        }
        // switch con String
        var dayName = "Lunes";
        switch (dayName) {
            case "Lunes":
                System.out.println("Hoy es lunes");
                break;
            case "Martes":
                System.out.println("Hoy es martes");
                break;
            case "Miércoles":
                System.out.println("Hoy es miércoles");
                break;
            default:
                System.out.println("No es lunes, martes o miércoles");
        }
        // switch con String y expresión
        var dayOfWeek = "Lunes";
        switch (dayOfWeek.toLowerCase()) {
            case "lunes":
                System.out.println("Hoy es lunes");
                break;
            case "martes":
                System.out.println("Hoy es martes");
                break;
            case "miércoles":
                System.out.println("Hoy es miércoles");
                break;
            default:
                System.out.println("No es lunes, martes o miércoles");
        }
    }
}
