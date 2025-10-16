import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System. in);
        System.out.print("Escribe los segundos: ");
        
        
        int segundos = sc.nextInt();
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;

        if (horas < 0 || minutos < 0) { 
            System.out.println("El valor de segundos no puede ser negativo.");
        } else if (segundos < 60) {
            System.out.println(segundos + " segundos son 0 horas y 0 minutos");
        } else if (segundos < 3600) {
            System.out.println(segundos + " segundos son 0 horas y " + minutos + " minutos");
        } else {
            System.out.println(segundos + " segundos son " + horas + " horas y " + minutos + " minutos");
        }
        
        sc.close();
    }
}
