import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero");
		if (teclado.nextInt()%2==0)
			System.out.println("El número introducido es par");
		else
			System.out.println("El número introducido es impar");
		teclado.close();

	}

}
