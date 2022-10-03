import java.util.Scanner;
import java.lang.Math;

public class Ex4 {

	static final double PI = 3.14;

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe el radio");
		double r = teclado.nextDouble();
		teclado.close();
		System.out.println("El área del círculo es "+PI*Math.pow(r, r));

	}

}
