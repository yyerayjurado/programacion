import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);


// hacer con do while, porq se va a calcular al menos una vez


        boolean repetir = true;
        while (repetir) {
            System.out.println("Introduce tu peso (kg):");
            float peso = 0;

            
            while (true) {
                peso = sc.nextFloat();
                if (peso <= 0) {
                    System.out.println("El peso debe ser un número positivo. Inténtalo de nuevo:");
                    continue;
                }
                break;
            }


            System.out.println("Introduce tu altura en cm:");
            float altura = 0;


            while (true) {
                if (altura > 0) {
                    System.out.println("Entrada no válida. Introduce un número:");
                    sc.next();
                    continue;
                }
                altura = sc.nextFloat();
                if (altura <= 0) {
                    System.out.println("La altura debe ser un número positivo. Inténtalo de nuevo:");
                    continue;
                }
                break;
            }

            float altura2 = altura / 100; 
            float imc = peso / (altura2 * altura2);

            System.out.println("Tu IMC es: " + imc);

            if (imc < 18.5f) {
                System.out.println("Bajo peso");
            } else if (imc >= 18.5f && imc < 24.9f) {
                System.out.println("Peso normal");
            } else if (imc >= 25f && imc < 29.9f) {
                System.out.println("Sobrepeso");
            } else {
                System.out.println("Obesidad");
            }


            System.out.println("¿Quieres calcular el IMC de otra persona? (0 es si, 1 es no)");
            double resp = sc.nextDouble();

            if (resp == 0 ) {
                repetir = true;
            } else {
                repetir = false;
            }
            
        }

        sc.close();
    }
}
