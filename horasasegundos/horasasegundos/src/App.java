import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la hora: ");
        int horas = sc.nextInt();
        if (horas < 0) {
            System.out.println("Error: no se permiten números negativos.");
        }

        System.out.print("Introduce los minutos: ");
        int minutos = sc.nextInt();
        if (minutos < 0) {
            System.out.println("Error: no se permiten números negativos.");
        }

        System.out.print("Introduce los segundos: ");
        int segundos = sc.nextInt();
        if (segundos < 0) {
            System.out.println("Error: no se permiten números negativos.");
        }

        int totalSegundos = horas * 3600 + minutos * 60 + segundos;

        System.out.print("Introduce la hora: ");
        int horas2 = sc.nextInt();
        if (horas2 < 0) {
            System.out.println("Error: no se permiten números negativos.");
        }

        System.out.print("Introduce los minutos: ");
        int minutos2 = sc.nextInt();
        if (minutos2 < 0) {
            System.out.println("Error: no se permiten números negativos.");
        }

        System.out.print("Introduce los segundos: ");
        int segundos2 = sc.nextInt();
        if (segundos2 < 0) {
            System.out.println("Error: no se permiten números negativos.");
        }

        int otrosSegundos = horas2 * 3600 + minutos2 * 60 + segundos2;

        int sumaSegundos = totalSegundos + otrosSegundos;
        int horasFinal = (sumaSegundos / 3600) % 24;
        int minutosFinal = (sumaSegundos % 3600) / 60;
        int segundosFinal = sumaSegundos % 60;

        if (horasFinal == 0 && minutosFinal == 0 && segundosFinal == 0) {
            System.out.println("Error: el resultado es 0 horas, 0 minutos y 0 segundos.");
        } else {
            System.out.println("La hora resultante es: " + horasFinal + " horas, " + minutosFinal + " minutos y " + segundosFinal + " segundos.");
        }

    }
}