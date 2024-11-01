import java.util.Scanner;

public class contadorNegativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorNegativos = 0;
        double numero;

        do {
            System.out.print("Introduce un número negativo (número positivo para salir): ");
            numero = scanner.nextDouble();

            if (numero < 0) {
                contadorNegativos++;
            }
        } while (numero < 0);

        System.out.println("Cantidad de números negativos ingresados: " + contadorNegativos);
        scanner.close();
    }
}
