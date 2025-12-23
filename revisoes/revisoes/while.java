package org.example;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class While {
    Scanner ler = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = ler.nextInt();

        while(idade<18){
        System.out.println("Acesso Negado.");
        System.out.println("Digite sua idade: ");
        idade=ler.nextInt();
    }
        
    System.out.println("Acesso permitido");
    System.out.println("Carregando");

}
