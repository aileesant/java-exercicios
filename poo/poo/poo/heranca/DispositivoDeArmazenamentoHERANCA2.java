package org.example.heranca.ex2;

public class DispositivoDeArmazenamento extends ModeloMarca{

    private String capacidadeDeArmazenamento;
    private String tipoConecao;

    public DispositivoDeArmazenamento(String modelo, String marca, String capacidadeDeArmazenamento, String tipoConecao) {
        super(modelo, marca);
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
        this.tipoConecao = tipoConecao;
    }

    public String getCapacidadeDeArmazenamento() {
        return capacidadeDeArmazenamento;
    }

    public void setCapacidadeDeArmazenamento(String capacidadeDeArmazenamento) {
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    public String getTipoConecao() {
        return tipoConecao;
    }

    public void setTipoConecao(String tipoConecao) {
        this.tipoConecao = tipoConecao;
    }

    @Override
    public String toString() {
        return "DispositivoDeArmazenamento{" +
                "capacidadeDeArmazenamento='" + capacidadeDeArmazenamento + '\'' +
                ", tipoConecao='" + tipoConecao + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}


//Commits on Sep 13, 2025
