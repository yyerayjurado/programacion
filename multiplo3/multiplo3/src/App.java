import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero positivo:");
        int numero = sc.nextInt();
        int suma_cifras = 0;
        int contador_cifras = 0;

        if (numero == 0) {
            contador_cifras = 1;
            suma_cifras = 0;
        } else {
            if (numero < 0) {
                numero = -numero; 
            }
        }

        while (numero > 0) {
            int cifra = numero % 10;
            suma_cifras += cifra;
            contador_cifras++;
            numero = numero / 10;
        }

        if (suma_cifras % 3 == 0) {
            System.out.println("La suma de las cifras es múltiplo de 3.");
        } else {
            System.out.println("La suma de las cifras no es múltiplo de 3.");
        }
        System.out.println("El número tiene " + contador_cifras + " cifras.");
        sc.close();
    }
}