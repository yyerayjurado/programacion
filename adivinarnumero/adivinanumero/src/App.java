import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repetir = true;

        while (repetir) {
            int numeroInventado = (int)(Math.random() * 100 + 1);
            int intentos = 5;
            int i = 0;
            
            boolean adivinado = false;

            System.out.println("Me voy a inventar un numero entre el 1 y el 100, tienes 5 intentos para adivinarlo...");

            while (i < intentos && !adivinado) {
                System.out.print("Introduce un numero: ");
                int numeroIntroducido = sc.nextInt();

                if (numeroIntroducido < 1 || numeroIntroducido > 100) {
                    System.out.println("El numero tiene que estar entre el 1 y el 100.");
                    continue;
                }i++;

                if (numeroIntroducido < numeroInventado) {
                    System.out.println("El numero es mayor.");
                } else if (numeroIntroducido > numeroInventado) {
                    System.out.println("El numero es menor.");
                } else {
                    System.out.println("¡Has adivinado el numero en " + i + " intentos!");
                    adivinado = true;
                }
            }

            if (!adivinado) {
                System.out.println("Te has quedado sin intentos. El numero era " + numeroInventado);
            }

            System.out.print("¿Quieres volver a jugar? (0 = sí, 1 = no): ");
            int resp = sc.nextInt();
            if (resp != 0) {
                repetir = false;
            }
        }

        sc.close();
    }
}
