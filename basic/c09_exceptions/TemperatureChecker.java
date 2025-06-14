package basic.c09_exceptions;

public class TemperatureChecker
// 7. Crea una clase TemperatureChecker que lanza una excepción personalizada si la temperatura es menor a -50 o mayor a 50.{
    extends Exception {

    public TemperatureChecker(String message) {
        super(message);
    }

    public static void checkTemperature(int temperature) throws TemperatureChecker {
        if (temperature < -50 || temperature > 50) {
            throw new TemperatureChecker("Temperatura fuera de rango: " + temperature);
        } else {
            System.out.println("Temperatura válida: " + temperature);
        }
    }
}
