import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del primer lado: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Ingrese la longitud del segundo lado: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Ingrese la longitud del tercer lado: ");
        double lado3 = scanner.nextDouble();

        // Comprobar si se puede formar un triángulo para ello se utilizo la regla de la desigualdad triangular
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Los números ingresados pueden formar un triángulo.");
        } else {
            System.out.println("Los números ingresados NO pueden formar un triángulo.");
        }

        scanner.close();
    }
}
