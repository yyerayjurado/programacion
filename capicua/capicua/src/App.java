import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();
        
        int cociente = numero / 2;
        int resto = numero % 2;

        do {
            cociente = cociente / 10;
            resto = resto % 10;
        } while (cociente != 0);        
        
        
        if (resto == 0) {
            System.out.println("El numero es capicua");
        } else {
            System.out.println("El numero no es capicua");
        }
    }
}
