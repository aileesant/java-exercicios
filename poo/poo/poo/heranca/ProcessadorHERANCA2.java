package org.example.heranca.ex2;

public class Processador extends ModeloMarca{

    private double Frequencia;

    public double getFrequencia() {
        return Frequencia;
    }

    public void setFrequencia(double frequencia) {
        Frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "Processador{" +
                "Frequencia=" + Frequencia +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public Processador(String modelo, String marca, double frequencia) {
        super(modelo, marca);
        Frequencia = frequencia;




    }
}

//Commits on Sep 13, 2025
