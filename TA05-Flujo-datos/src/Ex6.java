import java.util.Scanner;

public class Ex6 {

	final static double IVA = 0.21;
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el precio del producto en euros sin IVA");
		double p = teclado.nextDouble();
		teclado.close();
		System.out.println("Su precio final es "+(p + p*IVA) + " euros" );

	}

}
