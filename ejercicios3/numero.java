import java.util.Scanner;
public class numero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite un número: "); 
        var numero = scanner.nextDouble();
        if (numero == 0){
            System.out.println("el numero es 0");
        } else if (numero<0){
            System.out.println("el numero es negativo");
        } else if (numero>0){
            System.out.println("el numero es positivo");
        }
        scanner.close();


    }
}
