package org.example.heranca.ex1;

public class Pessoa {

    //nao é só meu, é d eoutras pessoas também, não é private
    protected String nome;
    protected int idade;

    //constructor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //get and set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

//Commits on Sep 13, 2025
