package basic.c08_oop;

/*
Clase 7 - Polimorfismo, abstracción y composición (21/05/2025)
Vídeo: https://www.twitch.tv/videos/2464789369
*/

import java.util.ArrayList;

public class a06_InheritanceExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Vehicle con un metodo move().
        //  Luego crea una subclase Car que herede de Vehicle y agrega el metodo honk().
        class Vehicle {
            public void move() {
                System.out.println("The vehicle is moving.");
            }
        }
        class Car extends Vehicle {
            public void honk() {
                System.out.println("The car is honking.");
            }
        }
        // Ejemplo de uso de las clases Vehicle y Car
        Car myCar = new Car();
        myCar.move();
        myCar.honk();


        // 2. Define una clase Person con los atributos name y age.
        // Luego crea una clase Student que agregue el atributo grade y un método study().
        // Clase base Person
        class Person {
            protected final String name;
            protected final int age;

            // Constructor
            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            // Método para mostrar información
            public void displayInfo() {
                System.out.println("Name: " + name + ", Age: " + age);
            }
        }

        // Clase derivada Student
        class Student extends Person {
            private final String grade;

            // Constructor
            public Student(String name, int age, String grade) {
                super(name, age); // Llama al constructor de Person
                this.grade = grade;
            }

            // Método adicional
            public void study() {
                System.out.println(name + " is studying.");
            }

            // Sobrescribe el método de mostrar info
            @Override
            public void displayInfo() {
                super.displayInfo();
                System.out.println("Grade: " + grade);
            }
        }
        // Ejemplo de uso de las clases Person y Student
        Student student = new Student("Ana", 20, "A");
        student.displayInfo();
        student.study();

        System.out.println("************************************************************************************");

        // 3. Crea una clase Animal con el método makeSound().
        //  Haz que Dog diga “Woof” y Cat diga “Meow” sobrescribiendo ese método.
        class Animal {

            // Método que puede ser sobrescrito por las subclases
            public void makeSound() {
                System.out.println("Animal sound");
            }
        }
        class Dog extends Animal {
            @Override
            public void makeSound() {
                System.out.println("Woof");
            }
        }
        class Cat extends Animal {
            @Override
            public void makeSound() {
                System.out.println("Meow");
            }

        class Bird extends Animal {
                @Override
                public void makeSound() {
                    System.out.println("Pio");
                }
            }

            // Ejemplo de uso de las clases Animal, Dog y Cat
            //Animal myDog = new Dog();
            //Animal myCat = new Cat();
            //myDog.makeSound(); // Imprime "Woof"
            //myCat.makeSound(); // Imprime "Meow"


            // 4. La clase Employee tiene los atributos name y salary.
            // Manager hereda de Employee y agrega el atributo department.
            class Employee {
                protected String name;
                protected double salary;

                public Employee(String name, double salary) {
                    this.name = name;
                    this.salary = salary;
                }

                public void showInfo() {
                    System.out.println("Name: " + name + ", Salary: " + salary);
                }
            }

            class Manager extends Employee {
                private String department;

                public Manager(String name, double salary, String department) {
                    super(name, salary); // Llama al constructor de Employee
                    this.department = department;
                }

                @Override
                public void showInfo() {
                    super.showInfo();
                    System.out.println("Department: " + department);
                }
            }

            // 5. Crea una clase abstracta Shape con un método calculateArea().
            //  Luego implementa ese método en Circle y Rectangle.
            abstract class Shape {
                public abstract double calculateArea();
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

            // Ejemplo de uso de las clases Shape, Circle y Rectangle
            Shape myCircle = new Circle(5);
            Shape myRectangle = new Rectangle(4, 6);
        //System.out.println("Circle area: "+myCircle.calculateArea()); // Imprime el área del círculo
        //System.out.println("Rectangle area: "+myRectangle.calculateArea()); // Imprime el área del rectángulo


            // 6. Crea una clase Bird con el método fly().
            //  Luego crea Eagle que sobrescriba fly() pero también llame al método original con super.fly().
            //class Bird {
            //    public void fly() {
            //        System.out.println("The bird is flying.");
            //    }
            //}

            //class Eagle extends Bird {
            //    @Override
            //    public void fly() {
            //        super.fly(); // Llama al método original de Bird
            //        System.out.println("The eagle is soaring high.");
            //    }
            //}
            // Ejemplo de uso de las clases Bird y Eagle
            //Bird myEagle = new Eagle();
            //myEagle.fly(); // Imprime "The bird is flying." seguido de "The eagle is soaring high."


            // 7. Haz una clase Device con un constructor que imprima “Device created”.
            // Luego crea Phone que herede de Device y en su constructor imprima “Phone ready”.
            class Device {
                public Device() {
                    System.out.println("Device created");
                }
            }

            class Phone extends Device {
                public Phone() {
                    super(); // Llama al constructor de Device
                    System.out.println("Phone ready");
                }
            }

            // Ejemplo de uso de las clases Device y Phone
            Device myPhone = new Phone(); // Imprime "Device created" seguido de "Phone ready"


            // 8. Account tiene un saldo y métodos para deposit() y withdraw().
            // SavingsAccount hereda y agrega un método addInterest().
            class Account {
                protected double balance;

                public Account(double initialBalance) {
                    this.balance = initialBalance;
                }

                public void deposit(double amount) {
                    balance += amount;
                    System.out.println("Deposited: " + amount + ", New Balance: " + balance);
                }

                public void withdraw(double amount) {
                    if (amount <= balance) {
                        balance -= amount;
                        System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
                    } else {
                        System.out.println("Insufficient funds for withdrawal.");
                    }
                }
            }

            class SavingsAccount extends Account {
                private double interestRate;

                public SavingsAccount(double initialBalance, double interestRate) {
                    super(initialBalance); // Llama al constructor de Account
                    this.interestRate = interestRate;
                }

                public void addInterest() {
                    double interest = balance * interestRate / 100;
                    balance += interest;
                    System.out.println("Interest added: " + interest + ", New Balance: " + balance);
                }
            }

            // Ejemplo de uso de las clases Account y SavingsAccount
            //Account myAccount = new SavingsAccount(1000, 5); // Crea una cuenta de ahorros con un saldo inicial y una tasa de interés
            //myAccount.deposit(200); // Deposita dinero en la cuenta
            //myAccount.withdraw(100); // Retira dinero de la cuenta
                //((SavingsAccount) myAccount).addInterest(); // Añade interés a la cuenta de ahorros
            // (necesario hacer un cast a SavingsAccount para llamar al método addInterest)


            // 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con un método describe() sobrescrito.
            class Vehiculo {
                public void describe() {
                    System.out.println("This is a vehicle.");
                }
            }

            class Coche extends Vehiculo {
                @Override
                public void describe() {
                    System.out.println("This is a car.");
                }
            }

            class Bici extends Vehiculo {
                @Override
                public void describe() {
                    System.out.println("This is a bike.");
                }
            }

            class Camion extends Vehiculo {
                @Override
                public void describe() {
                    System.out.println("This is a truck.");
                }
            }

            // Ejemplo de uso de las clases Vehicle, Car, Bike y Truck
            /*Vehiculo myCar = new Coche();
            Vehiculo myBike = new Bici();
            Vehiculo myTruck = new Camion();
            myCar.describe(); // Imprime "This is a car."
            myBike.describe(); // Imprime "This is a bike."
            myTruck.describe(); // Imprime "This is a truck."*/

            // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird.
            // Recorre la lista y llama a makeSound().



        }
    }
}
