import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce dos operandos");
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		System.out.println("Introduce el signo aritmético");
		String signo = teclado.next();
		
		switch (signo) {
		case "+": JOptionPane.showMessageDialog(null, a+b); break;
		case "-": JOptionPane.showMessageDialog(null, a-b); break;
		case "*": JOptionPane.showMessageDialog(null, a*b); break;
		case "/": JOptionPane.showMessageDialog(null, a/b); break;
		case "^": JOptionPane.showMessageDialog(null, Math.pow(a, b)); break;
		case "%": JOptionPane.showMessageDialog(null, a%b); break;
		}

	}

}
