package basic.c06_loops;

/*
Clase 5 - Bucles y funciones (06/05/2025)
Vídeo: https://www.twitch.tv/videos/2452053839
*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LoopsExercises {

    public static void main(String[] args) {

        // 1. Imprime los números del 1 al 10 usando while.
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        // (Nota: Para este ejercicio, necesitarías importar y usar ArrayList, pero no se incluye aquí.)

        ArrayList<String> list = new ArrayList<>();
        list.add("Elemento 1");
        list.add("Elemento 2");
        list.add("Elemento 3");
        int j = 0;
        if (list.isEmpty()) {
            System.out.println("La lista está vacía.");
        }
        else if (list.size() == 1) {
            System.out.println("La lista tiene un único elemento: " + list.get(0));
        }
        else if (list.size() > 1) {
            System.out.println("La lista tiene más de un elemento.");
        }
        do {
            System.out.println(list.get(j));
            j++;
        } while (j < list.size());

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        for (int k = 1; k <= 50; k++) {
            if (k % 5 == 0) {
                System.out.println("Multiplo numero " + k);
            }
        }

        // 4. Recorre un Array de 5 números e imprime la suma total.
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("La suma total es: " + sum);

        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        String[] array = {"Java", "Python", "JavaScript", "C++", "Ruby"};
        for (int index = 0; index < array.length; index++) {
            System.out.println("Valor en el índice " + index + ": " + array[index]);
        }

        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        // (Nota: Para este ejercicio, necesitarías importar y usar HashSet y HashMap, pero no se incluye aquí.)
        HashSet<Integer> numbersSet = new HashSet<>();
        numbersSet.add(10);
        numbersSet.add(20);
        numbersSet.add(30);
        for (Integer number : numbersSet) {
            System.out.println("Número en el HashSet: " + number);
        }
        HashMap<String, String> emails = new HashMap<>();
        emails.put("Brais", "Nombre");
        emails.put("Moure", "Apellido");
        emails.put("MoureDev", "Correo");
        for (Map.Entry<String, String> entry : emails.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        for (int l = 10; l >= 1; l--) {
            System.out.println("Número descendente: " + l);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        for (int m = 1; m <= 20; m++) {
            if (m % 3 == 0) {
                continue; // Salta los múltiplos de 3
            }
            System.out.println("Número no múltiplo de 3: " + m);
        }

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        int[] mixedNumbers = {1, 2, 3, -1, 4, 5};
        for (int number : mixedNumbers) {
            if (number < 0) {
                System.out.println("Número negativo encontrado: " + number);
                break; // Detiene el bucle al encontrar un número negativo
            }
            System.out.println("Número positivo: " + number);
        }

        // 10. Crea un programa que calcule el factorial de un número dado.
        int factorialNumber = 5; // Cambia este valor para probar
        int factorial = 1;
        for (int n = 1; n <= factorialNumber; n++) {
            factorial *= n; // Multiplica el número actual al factorial
        }
        System.out.println("El factorial de " + factorialNumber + " es: " + factorial);
    }
}
