import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Introduce tu nombre ");
        String nombre = sc.nextLine();

        
        System.out.print("Introduce tu edad ");
        double edad = sc.nextDouble();

        if (edad > 18) {
            System.out.println("Don " + nombre + " eres mayor de edad");
        } else {
            System.out.println("Don " + nombre + " eres un mindundi");
        }

        sc.close();
    }
    
}
