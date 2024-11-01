import java.util.Scanner;

public class cubo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;

        do {
            System.out.print("Introduce un número (número negativo para salir): ");
            numero = scanner.nextDouble();

            if (numero >= 0) {
                double cubo = numero*numero*numero;
                System.out.println("El cubo de " + numero + " es: " + cubo);
            } else {
                System.out.println("Número negativo detectado. Fin del programa.");
            }
        } while (numero >= 0);

        scanner.close();
    }
}
