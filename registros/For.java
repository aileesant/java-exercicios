import java.util.ArrayList;

public class FOR {

    public static void main(String args []){
        ArrayList<String> nomes = new ArrayList<>();
      nomes.add("Aiki");
      nomes.add("Ian");
      nomes.add("Mark");
      
      //Listando todos os objetos da lista
      System.out.println("Primeiros nomes" + nomes);
      //Acessando o elemento pelo indice
      System.out.println(nomes.get(0));
      

      //iteração sobre os elementos
      for (String nome : nomes){
        System.out.println(nome);

        nomes.remove("Ian");
        System.out.println("Após remoção a lista é: " + nomes);
        
      }

      //Commits on May 24, 2024
    }    
}
