import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        int numero = sc.nextInt();


        for (int i = 1; i < numero; i += 2) {
            System.out.println(i);
        }

        sc.close();
    }
}