package basic.c08_oop;

/*
Clase 6 - Clases, encapsulamiento y herencia (14/05/2025)
Vídeo: https://www.twitch.tv/videos/2459212698
*/
import java.util.ArrayList;
import java.util.List;
// Ejercicios de clases en Java

public class a03_ClassesExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
        class Book {
            private String title;
            private String author;
            // Constructor que recibe title y author
            public Book(String title, String author) {
                this.title = title;
                this.author = author;
            }

            public void showDetails() {
                System.out.println("Title: " + title + ", Author: " + author);
            }
        }
        //Ejemplo de uso de la clase Book
        Book book = new Book("1984", "George Orwell");
        book.showDetails();

        // 2. Crea una clase Dog con un método bark() que imprima su sonido.
        class Dog {
            public void bark() {
                System.out.println("Woof! Woof!");
            }
        }
        //Ejemplo de uso de la clase Dog
        Dog dog = new Dog();
        dog.bark();


        // 3. Añade un constructor a la clase Book que reciba title y author.

        // 4. Crea una clase Car con atributos brand y model y un método showData().
        class Car {
            private String brand;
            private String model;

            public Car(String brand, String model) {
                this.brand = brand;
                this.model = model;
            }

            public void showData() {
                System.out.println("Brand: " + brand + ", Model: " + model);
            }
        }
        //Ejemplo de uso de la clase Car
        Car car = new Car("Toyota", "Corolla");
        car.showData();


        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).
        class Student {
            private double score;

            public Student(double score) {
                this.score = score;
            }

            public void checkPass() {
                if (score >= 60) {
                    System.out.println("Student passed with score: " + score);
                } else {
                    System.out.println("Student failed with score: " + score);
                }
            }
        }
        //Ejemplo de uso de la clase Student
        Student student = new Student(75);
        student.checkPass();
        // Ejemplo de uso de la clase Student con un estudiante que no aprobó
        Student student2 = new Student(55);
        student2.checkPass();


        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
        class BankAccount {
            private double balance;

            public BankAccount(double initialBalance) {
                this.balance = initialBalance;
            }

            public void deposit(double amount) {
                if (amount > 0) {
                    balance += amount;
                    System.out.println("Deposited: " + amount + ", New Balance: " + balance);
                } else {
                    System.out.println("Deposit amount must be positive.");
                }
            }
        }
        //Ejemplo de uso de la clase BankAccount
        BankAccount account = new BankAccount(1000);
        account.deposit(200);
        // Ejemplo de uso de la clase BankAccount con un depósito negativo
        account.deposit(-50); // Esto debería mostrar un mensaje de error
        // Ejemplo de uso de la clase BankAccount con un depósito de 0
        account.deposit(0); // Esto debería mostrar un mensaje de error
        // Ejemplo de uso de la clase BankAccount con un depósito positivo
        account.deposit(300); // Esto debería sumar al saldo


        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
        class Rectangle {
            private double width;
            private double height;

            public Rectangle(double width, double height) {
                this.width = width;
                this.height = height;
            }

            public double calculateArea() {
                return width * height;
            }

            public double calculatePerimeter() {
                return 2 * (width + height);
            }
        }
        //Ejemplo de uso de la clase Rectangle
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        // Ejemplo de uso de la clase Rectangle con valores diferentes
        Rectangle rectangle2 = new Rectangle(3, 4);
        System.out.println("Area: " + rectangle2.calculateArea());
        System.out.println("Perimeter: " + rectangle2.calculatePerimeter());

        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
        class Worker {
            private String name;
            private double salary;

            public Worker(String name, double salary) {
                this.name = name;
                this.salary = salary;
            }

            public void showSalary() {
                System.out.println("Worker: " + name + ", Salary: " + salary);
            }
        }
        //Ejemplo de uso de la clase Worker
        Worker worker = new Worker("Alice", 50000);
        worker.showSalary();
        // Ejemplo de uso de la clase Worker con otro trabajador
        Worker worker2 = new Worker("Bob", 60000);
        worker2.showSalary();

        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
        class Person {
            private String name;
            private int age;

            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public void showInfo() {
                System.out.println("Name: " + name + ", Age: " + age);
            }
        }
        //Ejemplo de uso de la clase Person
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 30));
        people.add(new Person("Jane", 25));
        people.add(new Person("Alice", 28));
        for (Person person : people) {
            person.showInfo();
        }

        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
        class Product {
            private String name;
            private double price;

            public Product(String name, double price) {
                this.name = name;
                this.price = price;
            }

            public void applyDiscount(double discountPercentage) {
                if (discountPercentage < 0 || discountPercentage > 100) {
                    System.out.println("Invalid discount percentage.");
                    return;
                }
                double discountAmount = (discountPercentage / 100) * price;
                price -= discountAmount;
                System.out.println("Product: " + name + ", Price after discount: " + price);
            }
        }
        //Ejemplo de uso de la clase Product
        Product product = new Product("Laptop", 1000);
        product.applyDiscount(10); // Aplica un 10% de descuento
        // Ejemplo de uso de la clase Product con un descuento inválido
        product.applyDiscount(-5); // Esto debería mostrar un mensaje de error
        product.applyDiscount(110); // Esto debería mostrar un mensaje de error
    }
}
