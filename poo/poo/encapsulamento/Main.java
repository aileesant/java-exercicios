package org.example.encapsulamento;

public class Main {
    public static void main(String[] args) {
       // Instanciar a classe Cliente.
        Cliente cliente = new Cliente("sihak", "1798908098");
        Produto produto = new Produto();

        // Atribuir valor.
        // cliente.nome = "Marta";
        // cliente.telefone = "71356691";
        cliente.setNome("Yuta");
        cliente.setTelefone("719123456");
        produto.setNome("Sushi");
        produto.setPreco(7.99);


        // Mostrar.
        //System.out.println("Nome: " + cliente.nome);
        //System.out.println("Telefone: " + cliente.telefone);
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
    }
}

//Commits on Sep 6, 2025
