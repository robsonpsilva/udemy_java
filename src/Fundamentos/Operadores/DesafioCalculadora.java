package Fundamentos.Operadores;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o primeiro número");
        double s1 = entrada.nextDouble();
        System.out.println("Informe o segundo número");
        double s2 = entrada.nextDouble();
        System.out.println("Informe a operação");
        String s3 = entrada.next();

        double resultado = "+".equals(s3) ? s1+s2: 0;
        resultado = "-".equals(s3) ? s1-s2: resultado;
        resultado = "*".equals(s3) ? s1*s2: resultado;
        resultado = "/".equals(s3) ? s1/s2: resultado;
        resultado = "%".equals(s3) ? s1%s2: resultado;

        System.out.println("O resultado é: " + resultado);

    }
}
