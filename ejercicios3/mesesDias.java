import java.util.Scanner;

public class mesesDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite el mes en número del cual desea saber cuántos días tiene: ");
        int mes = scanner.nextInt();
        
        // Llamar a la función y mostrar el resultado
        diasDelMes(mes);
        
        scanner.close();
    }

    // Función para determinar y mostrar el número de días del mes
    public static void diasDelMes(int mes) {
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            System.out.println("El mes tiene 31 días.");
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            System.out.println("El mes tiene 30 días.");
        } else if (mes == 2) {
            System.out.println("El mes tiene 28 días.");
        } else { 
            System.out.println("Mes no encontrado.");
        }
    }
}