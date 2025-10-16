import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double pi = 3.14;

        System.out.print("Introduce el radio del círculo: ");
        double radio = sc.nextDouble();

        double a = -1;
        double b = 4;
        double c = 3;

        double perimetro = 2 * pi * radio;
        double area = pi * Math.pow(radio, 2);
        double volumen = 4 / 3 * pi * Math.pow(radio, 3);
        double ecuacion = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        double ecuacion2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        
        System.out.println("El perímetro del círculo con radio " + radio + " es: " + perimetro);
        System.out.println("El área del círculo con radio " + radio + " es: " + area);
        System.out.println("El volumen del círculo con radio " + radio + " es: " + volumen);
        System.out.println("El resultado de la ecuación 1 es: " + ecuacion);
        System.out.println("El resultado de la ecuación 2 es: " + ecuacion2);

        sc.close();
    }
}