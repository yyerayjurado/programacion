import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double nota;
        System.out.println("Ingrese la nota del estudiante:");
        nota = sc.nextDouble();

        if (nota >= 0 && nota <= 3) {
            System.out.println("Muy deficiente");
        }

        else if (nota >= 4 && nota <= 5) {
                System.out.println("Aprobado");
            }

        else if (nota ==6) {
                System.out.println("Bien");
        }

        else if (nota >=7 && nota <=8) {
                System.out.println("Notable");
        }

        else if (nota ==9) {
                System.out.println("Notable alto");
            
        }

        else if (nota ==10) {
                System.out.println("Sobresaliente");
            
        }

        else {
            System.out.println("Nota inválida. Debe estar entre 0 y 10.");
            
        }

        
        sc.close();

    }
    

}
