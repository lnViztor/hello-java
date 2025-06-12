package basic.c08_oop;

/*
Clase 7 - Polimorfismo, abstracción y composición (21/05/2025)
Vídeo: https://www.twitch.tv/videos/2464789369
*/

public class a07_Polymorphism {

    public static void main(String[] args) {


        // Polimorfismo

        // - Polimorfismo por herencia (sobrescritura)

        var animal = new Animal();
        animal.sound();

        var dog = new Dog();
        dog.sound();

        // - Polimorfismo por sobrecarga (sobrecarga de métodos)

        var calculator = new Calculator();
        System.out.println(calculator.sum(3, 5));
        System.out.println(calculator.sum(3.2, 5.4));
        System.out.println(calculator.sum(3, 5, 3));
        System.out.println(calculator.sum(3.2, 5.4, 3));
        System.out.println(calculator.multiply(3, 5));
        System.out.println(calculator.divide(10, 2));

    }

    // - Polimorfismo por herencia (sobrescritura)

    public static class Animal {

        public void sound() {
            System.out.println("Algún sonido");
        }
    }

    public static class Dog extends Animal {

        @Override
        public void sound() {
            System.out.println("Guau");
        }
    }

    // - Polimorfismo por sobrecarga (sobrecarga de métodos)

    public static class Calculator {
        // Métodos sobrecargados para sumar

        public int sum(int a, int b) {
            return a + b;
        }

        public int sum(int a, int b, int c) {
            return a + b + c;
        }

        public double sum(double a, double b) {
            return a + b;
        }

        public double sum(double a, double b, int c) {
            return a + b + c;
        }
        // Métodos para restar, multiplicar y dividir
        public int multiply(int a, int b) {
            return a * b;
        }
        //dividir
        public double divide(int a, int b) {
            if (b == 0) {
                throw new IllegalArgumentException("No se puede dividir por cero");
            }
            return (double) a / b;
        }
    }
}
