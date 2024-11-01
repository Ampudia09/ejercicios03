import java.util.Scanner;

public class sandia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el peso de la sandía en kilogramos: ");
        int peso = scanner.nextInt();
        
        String resultado = sePuedeDividirEnPares(peso);
        
        System.out.println(resultado);
        
        scanner.close();
    }

    // Función para verificar si el peso se puede dividir en dos números pares
    public static String sePuedeDividirEnPares(int peso) {
        // Para que se pueda dividir en dos números pares, el peso debe ser par y mayor o igual a 4 si no se cumple alguna de las dos condiciones no se podra
        if (peso >= 4 && peso % 2 == 0) {
            return "SI";
        } else {
            return "NO";
        }
    }
}