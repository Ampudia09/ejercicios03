import java.util.Scanner;

public class edad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("ingrese su edad: ");
        int edad = scanner.nextInt();

        if (edad>=0 && edad<=5){
            System.out.println("eres de la primera infancia");
        } else if (edad>=6 && edad<=11){
            System.out.println("estas en la etapa de infancia");
        } else if (edad>=12 && edad<=18){
            System.out.println("estas en la etapa de la adolecencia");
        } else if (edad>=19 && edad<=26){
            System.out.println("estas en la etapa de la juventud");
        } else if (edad>59){
            System.out.println("eres una persona mayor");
        } else if (edad>=27 && edad<=59){
            System.out.println("estas en la etapa de la adultez");
        }
        else {
            System.out.println("ingrse una edad valida");
        }

        







        scanner.close();
    }
}
