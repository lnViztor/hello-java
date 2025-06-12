package basic.c08_oop;

/*
Clase 7 - Polimorfismo, abstracción y composición (21/05/2025)
Vídeo: https://www.twitch.tv/videos/2464789369
*/

public class a07_PolymorphismExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Animal con el método makeSound().
        //  Luego crea subclases Dog, Cat y Cow que sobrescriban ese método con sonidos diferentes.
        //   Llama al método desde una lista de Animal.
        class Animal {
            public void makeSound() {
                System.out.println("Algún sonido");
            }
        }
        // Subclases de Animal
        class Dog extends Animal {
            @Override
            public void makeSound() {
                System.out.println("Woof");
            }
        }
        // Subclase Cat
        class Cat extends Animal {
            @Override
            public void makeSound() {
                System.out.println("Meow");
            }
        }
        // Subclase Cow
        class Cow extends Animal {
                @Override
                public void makeSound() {
                    System.out.println("Moo");
                }
            }
        //Ejemplo de uso
        System.out.println("\u001B[31mEjemplo de uso de Animal:\u001B[0m");
        java.util.ArrayList<Animal> animals = new java.util.ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Cow());
        for (Animal animal : animals) {
            animal.makeSound();
        }

        // 2. Crea una clase Shape con el método calculateArea().
        //  Luego implementa subclases Circle y Rectangle con sus propias fórmulas.
        //  Usa una lista de Shape para recorrer e imprimir el área de varias figuras.
        class Shape {
            public double calculateArea() {
                return 0;
            }
        }
        class Circle extends Shape {
            private double radius;

            public Circle(double radius) {
                this.radius = radius;
            }

            @Override
            public double calculateArea() {
                return Math.PI * radius * radius;
            }
        }
        class Rectangle extends Shape {
            private double width;
            private double height;

            public Rectangle(double width, double height) {
                this.width = width;
                this.height = height;
            }

            @Override
            public double calculateArea() {
                return width * height;
            }
        }
        //Ejemplo de uso
        System.out.println("\u001B[31mEjemplo de uso de Shape:\u001B[0m");
        java.util.ArrayList<Shape> shapes = new java.util.ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(4, 6));
        for (Shape shape : shapes) {
            System.out.println("Área: " + shape.calculateArea());
        }


        // 3. Crea una clase Printer con varios métodos print()
        // sobrecargados que acepten diferentes tipos de parámetros (String, int, double).
        // Llama a cada uno desde main.
        class Printer {
            public void print(String message) {
                System.out.println("String: " + message);
            }

            public void print(int number) {
                System.out.println("Int: " + number);
            }

            public void print(double number) {
                System.out.println("Double: " + number);
            }
        }
        //Ejemplo de uso
        System.out.println("\u001B[31mEjemplo de uso de Printer:\u001B[0m");
        Printer printer = new Printer();
        printer.print("Hola, mundo!");
        printer.print(42);
        printer.print(3.14);

        // 4. Crea una clase Greeter con dos métodos greet(): uno que salude con “Hello”,
        // y otro que reciba un nombre y salude con “Hello, [nombre]”.
        class Greeter {
            public void greet() {
                System.out.println("Hello");
            }

            public void greet(String name) {
                System.out.println("Hello, " + name);
            }
        }
        //Ejemplo de uso
        System.out.println("\u001B[31mEjemplo de uso de Greeter:\u001B[0m");
        Greeter greeter = new Greeter();
        greeter.greet();
        greeter.greet("Alice");

        // 5. Crea una clase Vehicle con un método start().
        //  Luego crea Car, Bike y Truck que sobrescriban ese método.
        //   Recorre una lista ArrayList<Vehicle> para llamar a start() en cada uno.
        class Vehicle {
            public void start() {
                System.out.println("El vehículo está arrancando");
            }
        }
        class Car extends Vehicle {
            @Override
            public void start() {
                System.out.println("El coche está arrancando");
            }
        }
        class Bike extends Vehicle {
            @Override
            public void start() {
                System.out.println("La bicicleta está arrancando");
            }
        }
        class Truck extends Vehicle {
            @Override
            public void start() {
                System.out.println("El camión está arrancando");
            }
        }
        //Ejemplo de uso
        System.out.println("\u001B[31mEjemplo de uso de Vehicle:\u001B[0m");
        java.util.ArrayList<Vehicle> vehicles = new java.util.ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Bike());
        vehicles.add(new Truck());
        for (Vehicle vehicle : vehicles) {
            vehicle.start();
        }

        // 6. Crea una clase Notification con método send(), y subclases EmailNotification, SMSNotification.
        //  Luego crea una función sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.


        // 7. Crea una función showAnimalType(Animal animal) que imprima el tipo de animal.
        // Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima su tipo con su propio getType() sobrescrito.


        // 8. Crea una clase Converter con métodos convert(int), convert(double), y convert(String) que devuelvan diferentes formatos de texto.
        class Converter {
            public String convert(int number) {
                return "Número entero: " + number;
            }

            public String convert(double number) {
                return "Número decimal: " + number;
            }

            public String convert(String text) {
                return "Texto: " + text;
            }
        }
        //Ejemplo de uso
        System.out.println("\u001B[31mEjemplo de uso de Converter:\u001B[0m");
        Converter converter = new Converter();
        System.out.println(converter.convert(42));
        System.out.println(converter.convert(3.14));
        System.out.println(converter.convert("Hola, mundo!"));


        // 9. Crea una clase Product con el método getPrice(). Luego, Book y Electronic deben sobrescribirlo con su propia
        //  lógica de descuento. Recorre una lista de Product e imprime el precio final de cada uno.
        class Product {
            public double getPrice() {
                return 0.0;
            }
        }
        class Book extends Product {
            private double price;

            public Book(double price) {
                this.price = price;
            }

            @Override
            public double getPrice() {
                return price * 0.9; // 10% de descuento
            }

        }
        class Electronic extends Product {
            private double price;

            public Electronic(double price) {
                this.price = price;
            }

            @Override
            public double getPrice() {
                return price * 0.8; // 20% de descuento
            }
        }
        //Ejemplo de uso
        System.out.println("\u001B[31mEjemplo de uso de Product:\u001B[0m");
        java.util.ArrayList<Product> products = new java.util.ArrayList<>();
        products.add(new Book(100));
        products.add(new Electronic(200));
        for (Product product : products) {
            System.out.println("Precio final: " + product.getPrice());
        }


        // 10. Crea una clase Character con método attack(). Luego crea subclases Warrior, Archer, Mage
        //  con ataques diferentes. En main, crea un array de Character y llama a attack() para cada uno.
        class Character {
            public void attack() {
                System.out.println("El personaje ataca");
            }
        }
        class Warrior extends Character {
            @Override
            public void attack() {
                System.out.println("El guerrero ataca con su espada");
            }
        }
        class Archer extends Character {
            @Override
            public void attack() {
                System.out.println("El arquero dispara una flecha");
            }
        }
        class Mage extends Character {
            @Override
            public void attack() {
                System.out.println("El mago lanza un hechizo");
            }
        }
        //Ejemplo de uso
        System.out.println("\u001B[31mEjemplo de uso de Character:\u001B[0m");
        java.util.ArrayList<Character> characters = new java.util.ArrayList<>();
        characters.add(new Warrior());
        characters.add(new Archer());
        characters.add(new Mage());
        for (Character character : characters) {
            character.attack();
        }
    }
}
