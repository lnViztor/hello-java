package basic.c08_oop;

/*
Clase 6 - Clases, encapsulamiento y herencia (14/05/2025)
Vídeo: https://www.twitch.tv/videos/2459212698
*/

public class a01_Classes {

    public static void main(String[] args) {
        //Instanciar un objeto de la clase a02_Person
        var person = new a02_Person("Brais", 37, "12345678A");

//        person.name = "Brais";
//        person.age = 38;

        person.sayHello();

        //person.name = "Brais Moure";
        //System.out.println(person.name);

//        person.id = "123456789A";

        //System.out.println(person.getId());

        person.setAge(38);
        person.setId("52991204D");
        System.out.println(person.getAge());
        person.sayHello();

        System.out.println("########Persona 2########");
        var person2 = new a02_Person("MoureDev", 18, "52991203P");
        person2.sayHello();
    }
}