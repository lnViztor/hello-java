package basic.c05_structures;

/*
Clase 4 - Listas, Sets y Mapas (31/04/2025)
Vídeo: https://www.twitch.tv/videos/2447254597
*/

public class StructuresExercises {

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.
        String[] array = {"Valor1", "Valor2", "Valor3", "Valor4", "Valor5"};
        System.out.println("Longitud del Array: " + array.length);

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        System.out.println("Valor en el índice 2 antes de modificar: " + array[2]);
        array[2] = "NuevoValor3";
        System.out.println("Valor en el índice 2 después de modificar: " + array[2]);

        // 3. Crea un ArrayList vacío.
        java.util.ArrayList<String> arrayList = new java.util.ArrayList<>();

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        arrayList.add("Elemento1");
        arrayList.add("Elemento2");
        arrayList.add("Elemento3");
        arrayList.add("Elemento4");

        // 5. Crea un HashSet con 2 valores diferentes.
        java.util.HashSet<String> hashSet = new java.util.HashSet<>();
        hashSet.add("Valor1");
        hashSet.add("Valor2");
        System.out.println("HashSet inicial: " + hashSet);
        // Imprime el HashSet
        System.out.println("HashSet: " + hashSet);

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        hashSet.add("Valor1"); // Repetido
        hashSet.add("Valor3"); // No repetido
        // Imprime el HashSet después de añadir los valores ordenados
        // (Nota: Los HashSet no mantienen un orden específico, pero se imprimirá el contenido actual)
        System.out.println("HashSet después de añadir valores: " + hashSet);

        // 7. Elimina uno de los elementos del HashSet.
        hashSet.remove("Valor2");
        // Imprime el HashSet después de eliminar un elemento
        System.out.println("HashSet después de eliminar un elemento: " + hashSet);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        java.util.HashMap<String, String> hashMap = new java.util.HashMap<>();
        hashMap.put("Brais", "123456789");
        hashMap.put("Moure", "987654321");
        hashMap.put("Usuario", "456789123");
        // Imprime el HashMap
        System.out.println("HashMap de contactos: " + hashMap);

        // 9. Modifica uno de los contactos y elimina otro.
        System.out.println("Teléfono de Moure antes de modificar: " + hashMap.get("Moure"));
        hashMap.put("Moure", "111222333"); // Modifica el número de teléfono de Moure
        System.out.println("Teléfono de Moure después de modificar: " + hashMap.get("Moure"));
        hashMap.remove("Usuario"); // Elimina el contacto "Usuario"
        // Imprime el HashMap después de modificar y eliminar contactos
        System.out.println("HashMap después de modificar y eliminar contactos: " + hashMap);

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
        String[] arrayToTransform = {"A", "B", "C", "D", "E"};
        // Transforma el Array en un ArrayList
        java.util.ArrayList<String> listFromArray = new java.util.ArrayList<>(java.util.Arrays.asList(arrayToTransform));
        System.out.println("ArrayList desde Array: " + listFromArray);
        // Transforma el ArrayList en un HashSet
        java.util.HashSet<String> setFromList = new java.util.HashSet<>(listFromArray);
        System.out.println("HashSet desde ArrayList: " + setFromList);
        // Transforma el HashSet en un HashMap con clave y valor, clave que sea un numerico tipo indice


        java.util.HashMap<Integer, String> mapFromSet = new java.util.HashMap<>();
        int index = 1;
        for (String item : setFromList) {
            mapFromSet.put(index++, item); // Clave y valor iguales
        }
        System.out.println("HashMap desde HashSet (clave y valor iguales): " + mapFromSet);
        // 11. Imprime el HashMap resultante.
        System.out.println("HashMap final: " + mapFromSet);

    }
}
