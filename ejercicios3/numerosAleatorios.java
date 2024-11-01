import java.util.Random;

public class numerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int cantidadPositivos = 0;
        int cantidadNegativos = 0;
        int cantidadCeros = 0;

        for (int i = 0; i < 120; i++) { //llega a 120 numeros y termina el ciclo
            int numero = random.nextInt(201) - 100;  // Genera un número entre -100 y 100

            if (numero > 0) {
                sumaPositivos += numero;
                cantidadPositivos++;
            } else if (numero < 0) {
                sumaNegativos += numero;
                cantidadNegativos++;
            } else {
                cantidadCeros++;
            }
        }

        // Calcular las medias dividiendo la suma sobre la cantidad
        double mediaPositivos = (cantidadPositivos > 0) ? (double) sumaPositivos / cantidadPositivos : 0;
        double mediaNegativos = (cantidadNegativos > 0) ? (double) sumaNegativos / cantidadNegativos : 0;

        // Resultados de las operaciones
        System.out.println("Suma de valores positivos: " + sumaPositivos);
        System.out.println("Suma de valores negativos: " + sumaNegativos);
        System.out.println("Media de valores positivos: " + mediaPositivos);
        System.out.println("Media de valores negativos: " + mediaNegativos);
        System.out.println("Cantidad de ceros: " + cantidadCeros);
    }
}

