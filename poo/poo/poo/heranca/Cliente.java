package org.example.heranca.ex1;

import javax.xml.crypto.Data;

public class Cliente extends Pessoa {

    private String dataDaCompra;
    private String formaDePagamento;

    public Cliente(String nome, int idade, String dataDaCompra, String formaDePagamento) {
        super(nome, idade); //super classe, relação de herança
        this.dataDaCompra = dataDaCompra;
        this.formaDePagamento = formaDePagamento;
    }

    public String getDataDaCompra() {
        return dataDaCompra;
    }

    public void setDataDaCompra(String dataDaCompra) {
        this.dataDaCompra = dataDaCompra;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dataDaCompra='" + dataDaCompra + '\'' +
                ", formaDePagamento='" + formaDePagamento + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}

//Commits on Sep 13, 2025
