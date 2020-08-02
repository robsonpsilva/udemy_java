package Fundamentos;
import javax.swing.*;
public class ConversaoStringNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String valor1 = JOptionPane.showInputDialog(
					"Digite o primeiro número!");
			String valor2 = JOptionPane.showInputDialog(
					"Digite o segundo número!");
			double numero1 = Double.parseDouble(valor1);
			double numero2 = Double.parseDouble(valor2);
			
			double soma = numero1+numero2;
			System.out.println(soma);
			JOptionPane.showMessageDialog(null, "O resultado da soma  é: " + soma);
			
	}

}
