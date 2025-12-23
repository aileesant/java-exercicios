package org.example.heranca.ex2;

public class Memoria extends ModeloMarca {

    private String CapacidadeDeArmazenamento;

    public Memoria(String modelo, String marca, String capacidadeDeArmazenamento) {
        super(modelo, marca);
        CapacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    public String getCapacidadeDeArmazenamento() {
        return CapacidadeDeArmazenamento;
    }

    public void setCapacidadeDeArmazenamento(String capacidadeDeArmazenamento) {
        CapacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    @Override
    public String toString() {
        return "Memoria{" +
                "CapacidadeDeArmazenamento='" + CapacidadeDeArmazenamento + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}

//Commits on Sep 13, 2025
