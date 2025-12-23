import java.util.Scanner;

public class TrabalhoForcaDistancia {

        public static void main(String[] args) {
           Scanner sc = new Scanner (System.in);
           System.out.println("Calcule o trabalho realizado por uma força que atua sobre um objeto.");
           System.out.print("Informe a força: ");
           double forc = sc.nextDouble();
           System.out.print("Infome a distância: ");
           double dist = sc.nextDouble();
    
           double trabalho = forc * dist;
    
           System.out.println("O resultado do trabalho é : " + trabalho);
           sc.close();
    
        }
        
    }

//Commits on May 24, 2024
