package org.example.heranca.ex2;

public class PlacaMae extends ModeloMarca{

    private String soquete;


    public PlacaMae(String modelo, String marca, String soquete) {
        super(modelo, marca);
        this.soquete = soquete;
    }

    public String getSoquete() {
        return soquete;
    }

    public void setSoquete(String soquete) {
        this.soquete = soquete;
    }

    @Override
    public String toString() {
        return "PlacaMae{" +
                "soquete='" + soquete + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}

//Commits on Sep 13, 2025
