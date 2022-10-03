import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex10 {

	public static void main(String[] args) {
		int nVentas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de ventas que introducirás a continuación"));
		double suma = 0;
		Scanner teclado = new Scanner(System.in);
		while (nVentas>0) {
			System.out.println("Introduce el importe de la venta");
			suma+=teclado.nextDouble();
			nVentas--;
		}
		teclado.close();
		System.out.println("Importe total: "+suma+" euros");
	}

}
