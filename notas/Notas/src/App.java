import java.util.Scanner;

public class App {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la nota de programación:");
        double programacion = sc.nextDouble();

        if (programacion >= 0 && programacion < 5) {
            System.out.println("España se va a pique");
        } 
        
        else if (programacion >= 5 && programacion < 8) {
            System.out.println("Como caza la perra");
        } 
        
        else if (programacion >= 9 && programacion <= 10) {
            System.out.println("España lo peta");
        }   
        
        else {
            System.out.println("Nota no válida");
        }

        sc.close();
    }
}
