import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número entero no negativo N: ");
		if (!sc.hasNextLong()) {
			System.out.println("Entrada no válida. Por favor introduce un entero no negativo.");
			sc.close();
			return;
		}

		long N = sc.nextLong();
		if (N < 0) {
			System.out.println("N debe ser no negativo.");
			sc.close();
			return;
		}

		// Implementación simple: usar Math.sqrt y ajustar por seguridad
		long R = (long) Math.sqrt(N);
		// Aumentar si es seguro
		while ((R + 1) <= N / (R + 1)) R++;
		// Disminuir si R^2 > N (seguro sin overflow usando división)
		while (R > 0 && R > N / R) R--;

		System.out.println("Raíz cuadrada entera R (mayor entero con R^2 ≤ N) = " + R);
		sc.close();
	}

}
