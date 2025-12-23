package org.example.heranca.ex1;

public class Main {
    public static void main(String[] args) {
        //instanciar as classe
        //classe abstrata noa deve se instanciar
        Cliente cliente = new Cliente("Yuta", 29, "13/09/2025", "Debito");
        Funcionario funcionario = new Funcionario("YUTA", 29, "123456.09", "Trainner", 5.500);

        System.out.println(cliente.toString());
        System.out.println(funcionario);
    }
}

//Commits on Sep 13, 2025
