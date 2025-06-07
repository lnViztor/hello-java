package basic.c03_strings;

/*
Clase 3 - Strings, Condicionales y Arrays (17/04/2025)
Vídeo: https://www.twitch.tv/videos/2436086584
*/

public class StringsExercises {

    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
        String str1 = "Hola";
        String str2 = "Mundo";
        String concatenated = str1 + " " + str2;

        // 2. Muestra la longitud de una cadena de texto.
        int length = concatenated.length();

        // 3. Muestra el primer y último carácter de un string.
        char firstChar = concatenated.charAt(0);
        char lastChar = concatenated.charAt(concatenated.length() - 1);
        System.out.println(firstChar + " " + lastChar);

        // 4. Convierte a mayúsculas y minúsculas un string.
        String upperCase = concatenated.toUpperCase();
        String lowerCase = concatenated.toLowerCase();
        System.out.println(upperCase);
        System.out.println(lowerCase);

        // Ejercicios adicionales: Capitaliza la cadena de texto.
        String capitalized = concatenated.substring(0, 1).toUpperCase() + concatenated.substring(1).toLowerCase();
        System.out.println("Capitalized: " + capitalized + "❤️\n");

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        String wordToCheck = "Mundo";
        boolean containsWord = concatenated.contains(wordToCheck);
        System.out.println("Contains '" + wordToCheck + "': " + containsWord);

        // 6. Formatea un string con un entero.
        int number = 42;
        String formattedString = String.format("El número es: %d", number);
        System.out.println(formattedString);

        // 7. Elimina los espacios en blanco al principio y final de un string.
        String stringWithSpaces = "   Hola Mundo   ";
        String trimmedString = stringWithSpaces.trim();
        System.out.println("Trimmed: '" + trimmedString + "'");
        System.out.println("Original: '" + stringWithSpaces + "'");
        System.out.println("Length of trimmed string: " + trimmedString.length());
        System.out.println("Length of original string: " + stringWithSpaces.length());
        System.out.println("Are lengths equal? " + (trimmedString.length() == stringWithSpaces.length()));
        System.out.println("Are contents equal? " + trimmedString.equals(stringWithSpaces));
        System.out.println("Are contents equal (ignoring spaces)? " + trimmedString.equalsIgnoreCase(stringWithSpaces));
        System.out.println("Are contents equal (ignoring case)? " + trimmedString.equalsIgnoreCase(stringWithSpaces));
        System.out.println("Are contents equal (ignoring case and spaces)? " + trimmedString.trim().equalsIgnoreCase(stringWithSpaces.trim()));


        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        String replacedSpaces = concatenated.replace(" ", "-");
        System.out.println("Replaced spaces: " + replacedSpaces);

        // 9. Comprueba si dos strings son iguales.
        String str3 = "Hola Mundo";
        boolean areEqual = concatenated.equals(str3);
        System.out.println("Are strings equal: " + areEqual);

        // 10. Comprueba si dos strings tienen la misma longitud.
        String str4 = "Hola";
        boolean sameLength = concatenated.length() == str4.length();
        System.out.println("Do strings have the same length: " + sameLength);

        // 11. Compara dos strings lexicográficamente.
        String str5 = "Hola Mundo";
        int comparisonResult = concatenated.compareTo(str5);
        if (comparisonResult < 0) {
            System.out.println("The first string is lexicographically less than the second.");
        } else if (comparisonResult > 0) {
            System.out.println("The first string is lexicographically greater than the second.");
        } else {
            System.out.println("Both strings are equal lexicographically.");
        }

    }
}
