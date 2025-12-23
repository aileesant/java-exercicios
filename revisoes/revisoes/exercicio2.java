import java.util.Scanner;

public class exercio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // entrada de dados
        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        
        System.out.println("Digite a primeira nota: ");
        int nota1 = sc.nextInt();

        System.out.println("Digite a segunda nota: ");
        int nota2 = sc.nextInt();

        // cálculo da média
        int media = (nota1 + nota2) / 2;

        // saída de acordo com a média
        if (media < 7) {
            System.out.println("\nVocê foi reprovado!");
        } else {
            System.out.println("\nVocê foi aprovado!");
        }

        // exibe nome e média
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Média: " + media);

        sc.close();
    }
}
