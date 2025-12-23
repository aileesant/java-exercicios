import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       System.out.println("Calcule o seu IMC.");
       System.out.print("Infome o seu peso: ");
       double peso = sc.nextDouble();
       System.out.print("Informe a sua altura: ");
       double altura = sc.nextDouble();

       double resultado =  peso * altura;

       System.out.println("o resultado do seu IMC é: " + resultado);
       sc.close();

    }
    
}

//Commits on May 24, 2024
