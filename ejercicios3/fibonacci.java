import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número (N) para mostrar los primeros N números de la sucesión de Fibonacci: ");
        int N = scanner.nextInt();
        
        // Validar que N sea positivo para que se pueda ejecutar 
        if (N <= 0) {
            System.out.println("Por favor, introduce un número positivo.");
        } else {
            int a = 0, b = 1;

            System.out.print("Sucesión de Fibonacci: ");
            
            for (int i = 1; i <= N; i++) {
                System.out.print(a + " ");

                // Actualizar los valores para el próximo número de la sucesión, ¡muy importante!
                int siguiente = a + b;
                a = b;
                b = siguiente;
            }
        }
        
        scanner.close();
    }
}
