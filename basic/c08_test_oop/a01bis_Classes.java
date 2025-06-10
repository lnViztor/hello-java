package basic.c08_test_oop;

/*
Clase 6 - Clases, encapsulamiento y herencia (14/05/2025)
Vídeo: https://www.twitch.tv/videos/2459212698
*/

import basic.c08_oop.a02_Person;

public class a01bis_Classes {

    public static void main(String[] args) {

        var person = new a02_Person("Brais", 38, "123456789A");

//        person.name = "Brais";
//        person.age = 38;

        person.sayHello();

//        person.name = "Brais Moure";
//        System.out.println(person.name);
    }
}