import java.util.Scanner;
public class hermanis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("digite un hermano que llego temprano en numero: ");
        int hermano1 = scanner.nextInt();
        System.out.print("digite el otro hermano que llego temprano en numero: ");
        int hermano2 = scanner.nextInt();

        if (hermano1 == 1 && hermano2==2 || hermano1 == 2 && hermano2==1 ){
            System.out.println("llego tarde el hermano menor");
        } else if (hermano1==3 && hermano2==1 || hermano1 == 1 && hermano2==3){
            System.out.println("llego el hermano del medio tarde");
        } else if (hermano1==3 && hermano2==2 || hermano1 == 2 && hermano2==3){
            System.out.println("llego tarde el hermano mayor");
        } else System.out.println("digite numeros entre 1 y 3 o no los digite iguales");
        scanner.close();
    }
}
