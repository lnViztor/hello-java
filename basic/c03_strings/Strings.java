package basic.c03_strings;

/*
Clase 3 - Strings, Condicionales y Arrays (17/04/2025)
Vídeo: https://www.twitch.tv/videos/2436086584
*/

public class Strings {

    public static void main(String[] args) {

        // Cadenas de texto

        // Declaración

        String name = "Victor";
        var surname = new String("Moure");

        // Operaciones básicas

        // Concatenación
        System.out.println("🚀Concatenación ");
        System.out.println(name + " " + surname);

        // Longitud
        System.out.println("🚀Longitud de la cadena ");
        System.out.println(name.length());

        // Obtener caracter
        System.out.println("🚀El ultimo carácter de ");
        System.out.println(name.charAt(name.length() - 1));

        // Subcadena
        System.out.println("🚀Subcadena ");
        System.out.println(name.substring(2));
        System.out.println(name.substring(1, 3));

        // Mayúsculas y minúsculas
        System.out.println("🚀Mayúsculas y minúsculas ");
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        //Capitalizar
        System.out.println("🚀Capitalizar ");
        System.out.println(name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase());

        System.out.println(name);

        // Comprobar si contiene
        System.out.println("🚀Compronbar si contiene ");
        System.out.println("Hola, Java".contains("Brais"));
        System.out.println("Hola, Java".toUpperCase().contains("AVA"));

        // Comparación
        System.out.println("🚀Comparación ");
        System.out.println(name.equals("Victor"));
        System.out.println(name.equals("victor"));
        System.out.println(name.equalsIgnoreCase("victor"));
        System.out.println("🎉🎉🎉🎉FIN");
        // == vs. equals

        var a = "Victor";
        var b = "Victor";
        var c = new String("Victor");

        System.out.println(a == b);
        System.out.println(a == c);
        // equals compara contenido
        System.out.println(a.equals(c));

        // Trim
        System.out.println(" Hola, me llamo Victor ".trim());

        // Replace
        System.out.println(" Hola, me llamo Victor ".replace("Victor", "Sanz"));

        // Format
        var age = 37;
        //variable float
        var height = 1.801f;
        System.out.println(String.format("Hola, %s. Tengo %d años y mido %1f metros.", name, age, height));
        System.out.println(String.format("Hola, %s. Tengo %d.", name, age));
    }
}
