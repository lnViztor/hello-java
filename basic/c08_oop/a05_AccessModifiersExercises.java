package basic.c08_oop;

/*
Clase 7 - Polimorfismo, abstracción y composición (21/05/2025)
Vídeo: https://www.twitch.tv/videos/2464789369
*/

public class a05_AccessModifiersExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Person con atributos privados name y age.
        // Usa los métodos getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase.
        class Person {
            private String name;
            private int age;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                if (age >= 0) {
                    this.age = age;
                } else {
                    System.out.println("Age cannot be negative.");
                }
            }
        }
        // Ejemplo de uso de la clase Person
        Person person = new Person();
        person.setName("John Doe");
        person.setAge(30);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // 2. Crea una clase Product con el atributo privado price.
        // Añade el método setPrice(double price) que solo permita precios mayores a 0.
        class Product {
            private double price;

            public void setPrice(double price) {
                if (price > 0) {
                    this.price = price;
                } else {
                    System.out.println("Price must be greater than 0.");
                }
            }

            public double getPrice() {
                return price;
            }
        }
        // Ejemplo de uso de la clase Product
        Product product = new Product();
        product.setPrice(100.0);
        System.out.println("Product price: " + product.getPrice());

        // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.
        class BankAccount {
            private double balance;

            public void deposit(double amount) {
                if (amount > 0) {
                    balance += amount;
                    System.out.println("Deposited: " + amount + ", New balance: " + balance);
                } else {
                    System.out.println("Deposit amount must be greater than 0.");
                }
            }

            public void withdraw(double amount) {
                if (amount > 0 && amount <= balance) {
                    balance -= amount;
                    System.out.println("Withdrew: " + amount + ", New balance: " + balance);
                } else {
                    System.out.println("Invalid withdrawal amount.");
                }
            }

            public double getBalance() {
                return balance;
            }
        }
        // Ejemplo de uso de la clase BankAccount
        BankAccount account = new BankAccount();
        account.deposit(500.0);
        account.withdraw(200.0);
        System.out.println("Current balance: " + account.getBalance());
        // Ejemplo de uso de la clase BankAccount con un depósito negativo
        account.deposit(-50); // Esto debería mostrar un mensaje de error
        // Ejemplo de uso de la clase BankAccount con un retiro negativo
        account.withdraw(-30); // Esto debería mostrar un mensaje de error
        // Ejemplo de uso de la clase BankAccount con un retiro mayor al saldo
        account.withdraw(400); // Esto debería mostrar un mensaje de error


        // 4. Crea una clase Book con el atributo privado title.
        // Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()).
        //  El título debe asignarse solo por el constructor.

        // 5. Crea una clase Temperature con el atributo privado celsius. El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.

        // 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.

        // 7. Crea una clase Employee con el atributo privado salary. Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.

        // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega setters y el método calculateArea() que devuelva el resultado de width * height.

        // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.

        // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).
    }
}
