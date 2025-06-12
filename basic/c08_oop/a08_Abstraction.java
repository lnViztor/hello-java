package basic.c08_oop;

/*
Clase 7 - Polimorfismo, abstracción y composición (21/05/2025)
Vídeo: https://www.twitch.tv/videos/2464789369
*/

public class a08_Abstraction {

    public static void main(String[] args) {

        // Abstracción

        // - Clase abstracta: una clase que no se puede instanciar y puede contener métodos abstractos
        // (sin implementación) y concretos (con implementación).

        var dog = new Dog();
        dog.sleep();
        dog.sound();

        var cat = new Cat();
        cat.sleep();
        cat.sound();

        // - Interface
    }

    // - Clase abstracta

    public static abstract class Animal {

        public abstract void sound();

        public void sleep() {
            System.out.println("El animal está durmiendo");
        }
    }

    public static class Dog extends Animal {

        @Override
        public void sound() {
            System.out.println("Guau");
        }

        @Override
        public void sleep() {
            System.out.println("El perro está durmiendo");
        }
    }

    public static class Cat extends Animal {

        @Override
        public void sound() {
            System.out.println("Miau");
        }
    }

    // - Interface: una colección de métodos abstractos que una clase puede implementar.

    public interface Flying {

        void fly();
    }


    public static class Bird extends Animal implements Flying {

        @Override
        public void sound() {
            System.out.println("Pio pio");
        }

        @Override
        public void fly() {
            System.out.println("El pájaro vuela");
        }

    }

    public static class Bat extends Animal implements Flying {

        @Override
        public void sound() {
            System.out.println("Soy batman!");
        }

        @Override
        public void fly() {
            System.out.println("El murciélago vuela");
        }
    }
}
