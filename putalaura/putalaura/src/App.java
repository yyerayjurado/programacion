import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int n;
        int posicion = 0;
        int binario = 0;
        int base = 2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número decimal: ");
        n = sc.nextInt();

        //pasar número a binario
        do {
            binario = (int) + (binario + ((n % base)*(Math.pow(10, posicion))));
            posicion++;
            n = n / base;

        }while (n > 0);

        System.out.println("El número binario es: " + binario);

    }
}