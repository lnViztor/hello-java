package basic.c08_oop;

/*
Clase 6 - Clases, encapsulamiento y herencia (14/05/2025)
Vídeo: https://www.twitch.tv/videos/2459212698
*/

public class a02_Person {

    // Atributos
    protected String name;
    private int age;
    private String id;

    // Constructor de clase obliga a pasar todos los parámetros
    public a02_Person(String name, int age, String id) {
        this.name = name;
        this.setAge(age);
        this.setId(id);
    }

    // Métodos
    public void sayHello() {
        System.out.println("Hola, soy " + name + ", tengo " + age + " años, y mi id es " + id + ".");
    }

    // Getter
    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        //valida DNI español con correspondencia de letra
        if (id != null && id.matches("\\d{8}[A-Z]")) {
            int dniNumber = Integer.parseInt(id.substring(0, 8));
            char dniLetter = id.charAt(8);
            char[] letters = "TRWAGMYFPDXBNJZSQVHLCKE".toCharArray();
            if (dniLetter == letters[dniNumber % 23]) {
                this.id = id;
                System.out.println("ID actualizado correctamente.");
            } else {
                System.out.println ("La letra del DNI no corresponde al número.");
            }
        }else {
            System.out.println("ID no válido. Debe tener 8 dígitos seguidos de una letra.");
        }
      }

    // Setter
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Edad no válida");
        }
    }
}
