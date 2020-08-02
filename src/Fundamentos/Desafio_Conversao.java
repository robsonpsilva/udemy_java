package Fundamentos;
import java.util.Scanner;

public class Desafio_Conversao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com o primeiro salário:" );
		Double i1 = Double.parseDouble(entrada.next().replace(",", "."));
		System.out.println("Entre com o segundo salário:" );
		Double i2 = Double.parseDouble(entrada.next().replace(",", "."));
		System.out.println("Entre com o terceiro salário:" );
		Double i3 = Double.parseDouble(entrada.next().replace(",", "."));
		
		System.out.println("Soma:" );
		System.out.println(i1+i2+i3);
		entrada.close();
	}

}
