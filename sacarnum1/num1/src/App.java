public class App {
    public static void main(String[] args) throws Exception {
        int contador = 0;

        for (int i = 0; i < 99; i++) {
            if (i % 10 == 1 || i / 10 == 1) {
                System.out.println(i);
            }
        }

        System.out.println("Total: " + contador);
    }
}
