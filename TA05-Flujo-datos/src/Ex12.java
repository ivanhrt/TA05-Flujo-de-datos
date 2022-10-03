import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una contraseña");
		String contraseña = teclado.nextLine();
		teclado.close();
		int fallos = 0;
		boolean acertado=false;
		String intento;
		
		do {
			
			intento = JOptionPane.showInputDialog("Intenta adivinar la contraseña, quedan " + (3-fallos) + " intentos");
			acertado = intento.equals(contraseña);
				
			fallos++;
		}while (fallos<3 && !acertado);
		
		if (acertado)
			JOptionPane.showMessageDialog(null, intento);

	}

}
