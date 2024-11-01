import java.util.Scanner;

public class ConversionDistancia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final double MILLAS_A_KILOMETROS = 1.60934;
        final double KILOMETROS_A_MILLAS = 0.621371;
        
        System.out.println("Seleccione el tipo de conversión:");
        System.out.println("1. Millas a Kilómetros");
        System.out.println("2. Kilómetros a Millas");
        System.out.print("Ingrese su opción (1 o 2): ");
        int opcion = scanner.nextInt();
        
        // Variable de distancia
        double distancia;
        
        switch (opcion) {
            case 1:
                // Millas a Kilómetros
                System.out.print("Ingrese la distancia en millas: ");
                distancia = scanner.nextDouble();
                double kilometros = distancia * MILLAS_A_KILOMETROS;
                System.out.println(distancia + " millas son " + kilometros + " kilómetros.");
                break;
                
            case 2:
                // Kilómetros a Millas
                System.out.print("Ingrese la distancia en kilómetros: ");
                distancia = scanner.nextDouble();
                double millas = distancia * KILOMETROS_A_MILLAS;
                System.out.println(distancia + " kilómetros son " + millas + " millas.");
                break;
                
            default:
                System.out.println("Opción no válida. Por favor, ingrese 1 o 2.");
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}
