import java.util.Scanner;

public class exercio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // pede o valor da compra
        System.out.print("Digite o valor da sua compra: ");
        double compra = sc.nextDouble();

        // número de prestações
        int prestacao = 5;

        // valor de cada prestação
        double valorParcela = compra / prestacao;

        // saída formatada
        System.out.println("\nLoja Mamão Com Açúcar");
        System.out.println("Valor da compra: R$ " + compra);
        System.out.println("Quantidade de parcelas: " + prestacao);
        System.out.println("Valor de cada parcela: R$ " + valorParcela);

        sc.close();
    }
}
