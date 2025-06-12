package basic.c08_oop.a07_PolymorphismExercises_solution;

public class e06 {
    // 6. Crea una clase Notification con método send(), y subclases EmailNotification, SMSNotification.
    //  Luego crea una función sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.
    public static void main(String[] args) {
        // Ejemplo de uso
        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();

        sendNotification(email); // Output: Sending email notification
        sendNotification(sms);   // Output: Sending SMS notification
    }
    public static void sendNotification(Notification n) {
        n.send();
    }
    static class Notification {
        public void send() {
            System.out.println("Sending generic notification");
        }
    }

    // Subclases
    static class EmailNotification extends Notification {
        @Override
        public void send() {
            System.out.println("Sending email notification");
        }
    }

    static class SMSNotification extends Notification {
        @Override
        public void send() {
            System.out.println("Sending SMS notification");
        }
    }

}
