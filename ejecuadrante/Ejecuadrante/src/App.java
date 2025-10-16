import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el numero x:");
        double valor1 = sc.nextDouble();

        System.out.println("Dime el numero y:");
        double valor2 = sc.nextDouble();

        if (valor1 == 0 && valor2 == 0) {
            System.out.println("El punto está en el origen.");
        } 
        
        else if (valor1 == 0) {
            System.out.println("El punto está sobre el eje Y.");
        } 
        
        else if (valor2 == 0) {
            System.out.println("El punto está sobre el eje X.");
        } 
        
        else if (valor1 > 0 && valor2 > 0) {
            System.out.println("El punto está en el primer cuadrante.");
        } 
        
        else if (valor1 < 0 && valor2 > 0) {
            System.out.println("El punto está en el segundo cuadrante.");
        } 
        
        else if (valor1 < 0 && valor2 < 0) {
            System.out.println("El punto está en el tercer cuadrante.");
        } 
        
        else if (valor1 > 0 && valor2 < 0) {
            System.out.println("El punto está en el cuarto cuadrante.");
        }
    }

}
