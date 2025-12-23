import java.util.Scanner;

public class Calculadora {

    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Informe o primeiro número: ");
        double n1 = sc.nextDouble();
        System.out.print("Informe o segundo número: ");
        double n2 = sc.nextDouble();

        double soma = n1 + n2;
        double subtracao = n1 - n2;
        double multiplicacao = n1 * n2;
        double divisao = n1 / n2;

        System.out.println("Soma:  " + soma);
        System.out.println("Subtração:  " + subtracao);
        System.out.println("Multiplicação:  " + multiplicacao);
        System.out.println("Divisão:  " + divisao);

        sc.close();

    }
}
//Commits on May 24, 2024
