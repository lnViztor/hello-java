package basic.c08_oop;

/*
Clase 6 - Clases, encapsulamiento y herencia (14/05/2025)
Vídeo: https://www.twitch.tv/videos/2459212698
*/

public class a03_ClassesExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
        class Book {
            private String title;
            private String author;

            public Book(String title, String author) {
                this.title = title;
                this.author = author;
            }

            public void showDetails() {
                System.out.println("Title: " + title + ", Author: " + author);
            }
        }

        // 2. Crea una clase Dog con un método bark() que imprima su sonido.
        class Dog {
            public void bark() {
                System.out.println("Woof! Woof!");
            }
        }
        // Ejemplo de uso de la clase Dog
        Dog myDog = new Dog();
        myDog.bark();



        // 3. Añade un constructor a la clase Book que reciba title y author.

        // 4. Crea una clase Car con atributos brand y model y un método showData().

        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).

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

        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.

        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.

        // 9. Crea varios objetos Person y guárdalos en un ArrayList.

        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
    }
}
