package org.example.heranca.ex1;

public class Funcionario extends Pessoa {

    //primeiro poe o extends e dps vem pra cá
    private String matricula;
    private String cargo;
    private double salario;

    //dps disso tudo, cria o construtor e tal

    public Funcionario(String nome, int idade, String matricula, String cargo, double salario) {
        super(nome, idade);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "matricula='" + matricula + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}

//Commits on Sep 13, 2025
