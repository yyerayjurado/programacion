import java.util.Scanner;
    
public class App {
public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double suma = 0;
            int contador = 0;
            double altura;
    
            System.out.println("Introduce alturas (negativa para terminar):");
            while (true) {
                altura = sc.nextDouble();
                if (altura < 0) {
                    break;
                }
                suma += altura;
                contador++;
            }
    
            if (contador > 0) {
                double media = suma / contador;
                System.out.println("La media de las alturas es: " + media);
            } else {
             System.out.println("No se introdujeron alturas válidas.");
        }
        sc.close();
      }
}