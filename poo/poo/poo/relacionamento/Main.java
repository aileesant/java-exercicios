package org.example.relacionamento;

public class Main {
    public static void main(String[] args) {

        // instanciar classes
        Endereco endereco = new Endereco("Rua A", "22", "Salvador");
        Cliente cliente1 = new Cliente("Yuta", 26, endereco);

        Cliente cliente2= new Cliente("Luiza", 56,
                new Endereco("Rua B", "55", "Rio de Janeiro"));


        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());

    }
}

//Commits on Sep 6, 2025
