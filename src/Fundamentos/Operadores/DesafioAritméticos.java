package Fundamentos.Operadores;

public class DesafioAritméticos {
    public static void main(String[] args) {
        double a = Math.pow((Math.pow((6*(3+2)), 2)/(3*2)- Math.pow((1-5)*(2-7)/2, 2)), 3);
        a = a/Math.pow(10,3);
        System.out.println(a);
    }
}
