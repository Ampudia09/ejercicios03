import java.util.Scanner;
public class camisas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("ingrese cuantas unidades de camiseta desea: ");  
        int unidades = scanner.nextInt();

        if (unidades>=1 && unidades<=50){
            System.out.println("El precio por unidad es de 50.000$");
        } else if (unidades>=50 && unidades<=100){
            System.out.println("el precio por unidad es de 45.000$");
        } else if (unidades>=100 && unidades<=150){
            System.out.println("el precio por unidad es de 40.000$");
        } else if (unidades>=150 && unidades<=200){
            System.out.println("el precio por unidad es de 35.000$");
        } else if (unidades>200){
            System.out.println("el precio por unidad es de 25.000$");
        } 

        scanner.close();

    }
}