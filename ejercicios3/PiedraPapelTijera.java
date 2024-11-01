import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String jugarOtraVez;  // Declaración de la variable para controlar si se juega otra vez
        jugarOtraVez = "s";
        do {
            // Ingreso de elección para el jugador 1
            System.out.print("Jugador 1 - Ingrese P para Piedra, L para Papel o T para Tijera: ");
            String jugador1 = scanner.nextLine().toUpperCase();

            // Ingreso de elección para el jugador 2
            System.out.print("Jugador 2 - Ingrese P para Piedra, L para Papel o T para Tijera: ");
            String jugador2 = scanner.nextLine().toUpperCase();

            // Determinación del ganador
            if (jugador1.equals(jugador2)) {
                System.out.println("Es un empate.");
            } else if (
                (jugador1.equals("P") && jugador2.equals("T")) || 
                (jugador1.equals("L") && jugador2.equals("P")) || 
                (jugador1.equals("T") && jugador2.equals("L"))
            ) {
                System.out.println("Jugador 1 gana la ronda.");
            } else if (
                (jugador2.equals("P") && jugador1.equals("T")) || 
                (jugador2.equals("L") && jugador1.equals("P")) || 
                (jugador2.equals("T") && jugador1.equals("L"))
            ) {
                System.out.println("Jugador 2 gana la ronda.");
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
                continue; // Volver a pedir las opciones si hay una entrada inválida
            }

            // Pregunta para volver a jugar
            System.out.print("¿Desea jugar otra ronda? (S para sí, N para no): ");
            jugarOtraVez = scanner.nextLine().toUpperCase();
            
        } while (jugarOtraVez.equals("S"));

        System.out.println("Gracias por jugar. ¡Hasta la próxima!");
        scanner.close();
    }
}
