package org.example;

import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
    int avaliacao;
        do {
        System.out.println("Avalie nosso atendimento, 1 a 5 estrelas: ");
        avaliacao = ler.nextInt();
        } while(avaliacao < 1 || avaliacao > 5);

        // || significa OU

        System.out.println("Obrigado!");

    }
}

//Commits on Aug 30, 2025
