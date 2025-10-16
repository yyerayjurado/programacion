public class App {
    public static void main(String[] args) throws Exception {
        int contador = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
                contador++;
            }
        }

        System.out.println("Total de números ímpares entre 1 e 100: " + contador);
        


    }
}
