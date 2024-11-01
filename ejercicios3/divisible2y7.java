import java.util.Scanner;
public class divisible2y7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("ingrese un numero entero: ");
        int num = scanner.nextInt();
        if (num % 2 == 0 && num % 7 == 0){
            System.out.println("el numero es divisible por 2 y 7");
        } else{System.out.println("el numero no es divisible por 2 y 7");}

        scanner.close();
    }
}