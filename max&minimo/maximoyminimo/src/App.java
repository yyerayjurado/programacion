import java.util.Scanner;
    
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        int contador = 0;
        double altura;
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;

        System.out.println("Introduce alturas (negativa para terminar):");
        while (true) {
            altura = sc.nextDouble();
            if (altura < 0) {
                break;
            }
            suma += altura;
            contador++;
            if (altura > max) {
                max = altura;
            }
            if (altura < min) {
                min = altura;
            }
        }

        if (contador > 0) {
            double media = suma / contador;
            System.out.println("La media de las alturas es: " + media);
            System.out.println("La altura máxima es: " + max);
            System.out.println("La altura mínima es: " + min);
        } else {
            System.out.println("No se introdujeron alturas válidas.");
        }
        sc.close();
    }
}