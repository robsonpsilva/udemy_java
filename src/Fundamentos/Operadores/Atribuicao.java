package Fundamentos.Operadores;

public class Atribuicao {
    public static void main(String[] args) {
        int a = 3;
        int b = a;
        int c = a + b;
        c += b;
        c -= b;
        c *= b;
        c /= a;
        c %= 2;
        c++;
        System.out.println(c);
    }
}
