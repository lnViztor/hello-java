package basic.c08_oop.a06_InheritanceExercises_solution;
import java.util.ArrayList;

public class e10 {
    // 3. Crea una clase Animal con el método makeSound().
    //  Haz que Dog diga “Woof” y Cat diga “Meow” sobrescribiendo ese método.

    // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird.
    // Recorre la lista y llama a makeSound().
    public static class Animal {

        // Método que puede ser sobrescrito por las subclases
        public void makeSound() {
            System.out.println("Animal sound");
        }
    }

    public static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Woof");
        }
    }

    public static class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Meow");
        }
    }

    public static class Bird extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Pio");
        }
    }

    public static void main(String[] args) {
        java.util.ArrayList<Animal> animals = new java.util.ArrayList<>();
        var animalcomun = new Animal();
        animals.add(animalcomun);
        // Añadimos instancias de Dog, Cat y Bird a la lista
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Bird());
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}

