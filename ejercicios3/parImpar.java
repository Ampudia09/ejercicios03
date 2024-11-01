import java.util.Scanner;
public class parImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("ingrese un numero entero: ");
        int num = scanner.nextInt();
        if (num % 2 == 0){
            System.out.println("el numero es par");
        } else{System.out.println("el numero es impar");}

        scanner.close();
    }
}
