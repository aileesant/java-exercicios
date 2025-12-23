package org.example.polimorfismo.ex2;

public class Main {
    public static void main(String[] args) {

        Divisao divisao = new Divisao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Subtracao subtracao = new Subtracao();
        Soma soma = new Soma();

        System.out.println("Soma: "  + soma.calcular(2,3));
        System.out.println("Divisão: " + divisao.calcular(10, 2));
        System.out.println("Multiplicação: " + multiplicacao.calcular(2,10));
        System.out.println("Subtração: " + subtracao.calcular(10, 5));
    }
}
