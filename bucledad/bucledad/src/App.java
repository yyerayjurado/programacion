import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantas personas hay en clase?");
        int personas = sc.nextInt();
        int mayor = 0;
        
        for (int i = 1; i <= personas; i++) {
            System.out.println("Introduce la edad");
            int edad = sc.nextInt();
            if (edad > mayor) {
                mayor = edad;
            }
        }
        System.out.println("La edad mayor es: " + mayor);
    }
}