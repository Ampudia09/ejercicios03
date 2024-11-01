import java.util.Scanner;

public class diamante {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el tamaño del diamante (un número impar): ");
        int tamano = scanner.nextInt();

        if (tamano <= 0 || tamano % 2 == 0) {
            System.out.println("Por favor, ingresa un número entero positivo impar.");
        } else {
            dibujarDiamante(tamano);
        }

        scanner.close();
    }

    public static void dibujarDiamante(int tamano) {
        // Mitad superior del diamente
        for (int i = 1; i <= tamano; i += 2) {
            int espacios = (tamano - i) / 2;
            System.out.println(" ".repeat(espacios) + "*".repeat(i));
        }

        // Mitad inferior del diamante
        for (int i = tamano - 2; i > 0; i -= 2) {
            int espacios = (tamano - i) / 2;
            System.out.println(" ".repeat(espacios) + "*".repeat(i));
        }
    }
}
