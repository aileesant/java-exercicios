package org.example.encapsulamento;

public class Cliente {
   private String nome;
   private String telefone;

    public Cliente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    //metodos de acesso
    //set colocar um valor lá
    //get mostrar
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

//Commits on Sep 6, 2025
