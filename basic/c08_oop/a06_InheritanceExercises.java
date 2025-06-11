package basic.c08_oop;

/*
Clase 7 - Polimorfismo, abstracción y composición (21/05/2025)
Vídeo: https://www.twitch.tv/videos/2464789369
*/

public class a06_InheritanceExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Vehicle con un método move().
        //  Luego crea una subclase Car que herede de Vehicle y agrega el método honk().
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
        Car myCar = new Car();
        myCar.move();
        myCar.honk();


        // 2. Define una clase Person con los atributos name y age. Luego crea una clase Student que agregue el atributo grade y un método study().

        // 3. Crea una clase Animal con el método makeSound(). Haz que Dog diga “Woof” y Cat diga “Meow” sobrescribiendo ese método.

        // 4. La clase Employee tiene los atributos name y salary. Manager hereda de Employee y agrega el atributo department.

        // 5. Crea una clase abstracta Shape con un método calculateArea(). Luego implementa ese método en Circle y Rectangle.

        // 6. Crea una clase Bird con el método fly(). Luego crea Eagle que sobrescriba fly() pero también llame al método original con super.fly().

        // 7. Haz una clase Device con un constructor que imprima “Device created”. Luego crea Phone que herede de Device y en su constructor imprima “Phone ready”.

        // 8. Account tiene un saldo y métodos para deposit() y withdraw(). SavingsAccount hereda y agrega un método addInterest().

        // 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con un método describe() sobrescrito.

        // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird. Recorre la lista y llama a makeSound().
    }
}
