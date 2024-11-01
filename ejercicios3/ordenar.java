import java.util.Scanner;

public class ordenar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Ingrese el tercer número entero: ");
        int num3 = scanner.nextInt();
        
        // Llamada a la función para obtener el resultado
        String resultado = ordenarYConcatenar(num1, num2, num3);
        
        // Imprimir el resultado
        System.out.println("Output: " + resultado);
        
        scanner.close();
        
    }

    // Función para ordenar los números y concatenarlos
    public static String ordenarYConcatenar(int a, int b, int c) {
        int menor, medio, mayor;

        // Ordenar los números
        if (a < b && a < c) {
            menor = a;
            if (b < c) {
                medio = b;
                mayor = c;
            } else {
                medio = c;
                mayor = b;
            }
        } else if (b < a && b < c) {
            menor = b;
            if (a < c) {
                medio = a;
                mayor = c;
            } else {
                medio = c;
                mayor = a;
            }
        } else {
            menor = c;
            if (a < b) {
                medio = a;
                mayor = b;
            } else {
                medio = b;
                mayor = a;
            }
        }

        // Concatenar los números en orden ascendente
        return String.valueOf(menor) + String.valueOf(medio) + String.valueOf(mayor);
    }
}

