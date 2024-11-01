import java.util.Scanner;

public class vocalConsonante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una letra: ");
        char letra = scanner.next().charAt(0);

        // Verifica si la letra es una letra válida
        if (Character.isLetter(letra)) {
            // Convierte la letra a minúscula para simplificar la comparación sino nos
            // tocaria tambier tener en cuenta las vocales mayusculas
            letra = Character.toLowerCase(letra);

            // Verifica si es una vocal
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                System.out.println("La letra es una vocal.");
            } else {
                System.out.println("La letra es una consonante.");
            }
        } else {
            System.out.println("El carácter ingresado no es una letra.");
        }

        scanner.close();
    }
}
