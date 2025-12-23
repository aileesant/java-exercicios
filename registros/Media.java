import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       System.out.print("Infome o primeiro número: ");
       double n1 = sc.nextDouble();
       System.out.print("Informe o segundo número: ");
       double n2 = sc.nextDouble();

       double media = (n1 + n2) / 2;

       System.out.println("A média é: " + media);
       sc.close();

    }
    
}

//Commits on May 24, 2024
