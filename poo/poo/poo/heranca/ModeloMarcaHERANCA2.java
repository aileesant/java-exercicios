package org.example.heranca.ex2;

public abstract class ModeloMarca {

    protected String modelo;
    protected String marca;

    public ModeloMarca(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

  //Commits on Sep 13, 2025
}
