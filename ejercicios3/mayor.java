import java.util.Scanner;
public class mayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.err.print("ingrese el primer numero: ");
        double num1 = scanner.nextDouble();
        System.err.print("ingrese el segundo numero: ");
        double num2 = scanner.nextDouble();
        System.err.print("ingrese el tercer numero: ");
        double num3 = scanner.nextDouble();

        if (num1>num2 && num1>num3) {
            System.out.println("el numero mayor es " + num1);
        } else if (num2>num1 && num2>num3) {
            System.out.println("el numero mayor es " + num2);
        } else {System.out.println("el numero mayor es " + num3);}

        scanner.close();

    }
}
