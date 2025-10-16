import java.util.Scanner;

public class App {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserte el primer opearando: ");
        float num1 = scanner.nextFloat();

        System.out.print("Inserte el segundo opearando: ");
        float num2 = scanner.nextFloat();       
        
        System.out.print("Pulsa 1 para sumar: ");
        System.out.print("Pulsa 2 para restar: ");
        System.out.print("Pulsa 3 para multiplicar: ");
        System.out.print("Pulsa 4 para dividir: ");
        int operacion = scanner.nextInt();

        float resultado = 0;

        switch (operacion) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: División por cero no permitida.");
                }
                break;
            default:
                System.out.println("Operación no válida.");
        }
        
        System.out.println("El resultado es: " + resultado);
        scanner.close();
    }

}
