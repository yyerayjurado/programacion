import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*
        Crea un programa en Java que pida al usuario un número entero positivo n.
        El objetivo es mostrar todos los numeros primos menores que n.
         */

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Introduce un numero: ");
        num = sc.nextInt();
        System.out.println("Los numeros primos menores que " + num + " son:");

        // Comprobamr si el número es mayor que 0
        if (num > 0) {

            for (int i = num - 1; i >= 2; i--) { //Recorre los numeros desde num -1 hasta 2.se para cuando llegua a 2.

                int divisor = 2;
                boolean esPrimo = true;
                double raiz = Math.sqrt(i);
                
                //Funcion que valida si es primo
                while (divisor < raiz && esPrimo) { // va desde 2 hasta num-1
                    if (i % divisor == 0) {
                        esPrimo = false;
                    } else {
                        divisor = divisor + 1;//Vamos aumentando de uno en uno hasta el n-1.
                    }
                }
                if (esPrimo) {
                    System.out.println(i);
        } else {
            System.out.println("El numero introducido debe ser mayor que 0");
        }
    }
}       }

    }

}