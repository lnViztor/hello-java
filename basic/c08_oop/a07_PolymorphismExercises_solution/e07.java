package basic.c08_oop.a07_PolymorphismExercises_solution;

public class e07 {
    // 7. Crea una función showAnimalType(Animal animal) que imprima el tipo de animal.
    // Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima su tipo con su propio getType() sobrescrito.
    //Ejemplo de uso
        static class AnimalType {
            public String getType() {
                return "Animal";
            }
        }
        static class DogType extends AnimalType {
            @Override
            public String getType() {
                return "Dog";
            }
        }
        static class CatType extends AnimalType {
            @Override
            public String getType() {
                return "Cat";
            }
        }
        static class HorseType extends AnimalType {
            @Override
            public String getType() {
                return "Horse";
            }
        }
        public static void showAnimalType(AnimalType animal) {
            System.out.println("Tipo de animal: " + animal.getType());
        }
        public static void main(String[] args) {
            // Ejemplo de uso
            System.out.println("\u001B[31mEjemplo de uso de AnimalType:\u001B[0m");
            showAnimalType(new DogType());
            showAnimalType(new CatType());
            showAnimalType(new HorseType());
    }
}
