import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double num1, num2, num3;

        // numero1
        do {
            System.out.println("Ingresa el primer numero real:");
            num1 = sc.nextDouble();
            if (num1 <= 0) {
                System.out.println("El número debe ser positivo.");
            }
        } while (num1 <= 0);


        // numero2
        do {
            System.out.println("Ingresa el segundo numero real:");
            num2 = sc.nextDouble();
            if (num2 <= 0) {
                System.out.println("El número debe ser positivo.");
            }
        } while (num2 <= 0);


        // nunero3
        do {
            System.out.println("Ingresa el tercer numero real:");
            num3 = sc.nextDouble();
            if (num3 <= 0) {
                System.out.println("El número debe ser positivo.");
            }
        } while (num3 <= 0);

        double media = (num1 + num2 + num3) / 3;
        System.out.println("La media es: " + media);
    
        sc.close();
    }
}