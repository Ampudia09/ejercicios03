import java.util.Scanner;

public class positivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;

        do {
            System.out.print("Introduce un número (cero para salir): ");
            numero = scanner.nextDouble();

            if (numero > 0) {
                System.out.println("El número es positivo.");
            } else if (numero < 0) {
                System.out.println("El número es negativo.");
            } else {
                System.out.println("Cero detectado. Fin del programa.");
            }
        } while (numero != 0);

        scanner.close();
    }
}
