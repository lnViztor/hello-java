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
        class Book {
            private String title;

            public Book(String title) {
                this.title = title;
            }

            public String getTitle() {
                return title;
            }
        }
        // Ejemplo de uso de la clase Book
        Book book = new Book("Effective Java");
        System.out.println("Book title: " + book.getTitle());
        // Ejemplo de uso de la clase Book con un título diferente
        Book book2 = new Book("Clean Code");
        System.out.println("Book title: " + book2.getTitle());
        // Ejemplo de uso de la clase Book intentando modificar el título (esto no es posible)
        // book2.setTitle("Refactoring"); // Esto debería dar un error de compilación, ya que no hay un setter para title

        // 5. Crea una clase Temperature con el atributo privado celsius.
        // El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.
        class Temperature {
            private double celsius;

            public void setCelsius(double celsius) {
                if (celsius >= -100 && celsius <= 100) {
                    this.celsius = celsius;
                } else {
                    System.out.println("Temperature must be between -100 and 100 degrees Celsius.");
                }
            }

            public double getCelsius() {
                return celsius;
            }
        }
        // Ejemplo de uso de la clase Temperature
        Temperature temperature = new Temperature();
        temperature.setCelsius(25.0);
        System.out.println("Current temperature: " + temperature.getCelsius() + "°C");
        // Ejemplo de uso de la clase Temperature con un valor fuera del rango
        temperature.setCelsius(150.0); // Esto debería mostrar un mensaje de error
        temperature.setCelsius(-150.0); // Esto debería mostrar un mensaje de error
        // Ejemplo de uso de la clase Temperature con un valor válido
        temperature.setCelsius(75.0); // Esto debería actualizar la temperatura correctamente



        // 6. Crea una clase User con los atributos privados username y password.
        // Implementa los métodos setUsername(String username), setPassword(String password) y
        // checkPassword(String inputPassword) que compare contraseñas.
        class User {
            private String username;
            private String password;

            public void setUsername(String username) {
                this.username = username;
            }

            public void setPassword(String password) {
                this.password = password;
            }

            public boolean checkPassword(String inputPassword) {
                return this.password.equals(inputPassword);
            }

            public String getUsername() {
                return username;
            }
        }
        // Ejemplo de uso de la clase User
        User user = new User();
        user.setUsername("john_doe");
        user.setPassword("securePassword123");
        System.out.println("Username: " + user.getUsername());
        // Verificación de contraseña correcta
        if (user.checkPassword("securePassword123")) {
            System.out.println("Password is correct.");
        } else {
            System.out.println("Incorrect password.");
        }

        // 7. Crea una clase Employee con el atributo privado salary.
        // Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.
        class Employee {
            private double salary;

            public Employee(double initialSalary) {
                this.salary = initialSalary;
            }

            public void raiseSalary(double percent) {
                if (percent > 0) {
                    salary += salary * (percent / 100);
                    System.out.println("New salary after raise: " + salary);
                } else {
                    System.out.println("Raise percentage must be positive.");
                }
            }

            public double getSalary() {
                return salary;
            }
        }
        // Ejemplo de uso de la clase Employee
        Employee employee = new Employee(50000);
        System.out.println("Initial salary: " + employee.getSalary());
        employee.raiseSalary(10); // Aumento del 10%
        System.out.println("Salary after raise: " + employee.getSalary());
        // Ejemplo de uso de la clase Employee con un aumento negativo
        employee.raiseSalary(-5); // Esto debería mostrar un mensaje de error
        // Ejemplo de uso de la clase Employee con un aumento del 0%
        employee.raiseSalary(0); // Esto debería mostrar un mensaje de error

        // 8. Crea una clase Rectangle con los atributos privados width y height.
        // Agrega setters y el método calculateArea() que devuelva el resultado de width * height.
        class Rectangle {
            private double width;
            private double height;

            public void setWidth(double width) {
                if (width > 0) {
                    this.width = width;
                } else {
                    System.out.println("Width must be greater than 0.");
                }
            }

            public void setHeight(double height) {
                if (height > 0) {
                    this.height = height;
                } else {
                    System.out.println("Height must be greater than 0.");
                }
            }

            public double calculateArea() {
                return width * height;
            }
        }
        // Ejemplo de uso de la clase Rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(10);
        System.out.println("Rectangle area: " + rectangle.calculateArea());

        // 9. Crea una clase Student con el atributo privado grade.
        // Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.
        class Student {
            private int grade;

            public void setGrade(int grade) {
                if (grade >= 0 && grade <= 100) {
                    this.grade = grade;
                } else {
                    System.out.println("Grade must be between 0 and 100.");
                }
            }

            public boolean isPassed() {
                return grade >= 60;
            }

            public int getGrade() {
                return grade;
            }
        }
        // Ejemplo de uso de la clase Student
        Student student = new Student();
        student.setGrade(75);
        System.out.println("Student grade: " + student.getGrade());
        if (student.isPassed()) {
            System.out.println("Student has passed.");
        } else {
            System.out.println("Student has not passed.");
        }


        // 10. Crea una clase Car con el atributo privado speed.
        // Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120)
        // y brake(int amount) que reduzca la velocidad (mínimo 0).
        class Car {
            private int speed;

            public void accelerate(int amount) {
                if (amount > 0 && speed + amount <= 120) {
                    speed += amount;
                    System.out.println("Car accelerated. New speed: " + speed + " km/h");
                } else {
                    System.out.println("Invalid acceleration amount or speed limit exceeded.");
                }
            }

            public void brake(int amount) {
                if (amount > 0 && speed - amount >= 0) {
                    speed -= amount;
                    System.out.println("Car braked. New speed: " + speed + " km/h");
                } else {
                    System.out.println("Invalid brake amount or speed cannot be negative.");
                }
            }

            public int getSpeed() {
                return speed;
            }
        }
        // Ejemplo de uso de la clase Car
        Car car = new Car();
        car.accelerate(50); // Aumenta la velocidad a 50 km/h
        car.accelerate(80); // Esto debería mostrar un mensaje de error, ya que excede el límite de 120 km/h
        car.brake(20); // Reduce la velocidad a 30 km/h
        System.out.println("Current car speed: " + car.getSpeed() + " km/h");
        car.brake(40); // Esto debería mostrar un mensaje de error, ya que no puede reducir la velocidad a menos de 0 km/h
    }
}
