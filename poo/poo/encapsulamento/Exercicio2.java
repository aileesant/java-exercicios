package exercicio1;

public class Main {
    public static void main(String[] args) {

        //instanciar a classe
    ContaBancaria contaBancaria = new ContaBancaria("Bradesco", 1234, 999999-9, "corrente", 5489.9, 10000.00);
    Funcionario funcionario = new Funcionario(1234567, "Yuta", "Rua A", 719123456, "funcionario123", 123456789);
        //atribuir valor


        //mostrar

        System.out.println("Banco: " + contaBancaria.getBanco());
        System.out.println("Agência: " + contaBancaria.getAgencia());
        System.out.println("Número da Conta: " + contaBancaria.getNumero());
        System.out.println("Tipo da conta: " + contaBancaria.getTipo());
        System.out.println("Saldo atual: " + contaBancaria.getSaldo());
        System.out.println("Limite Disponìvel: " + contaBancaria.getLimite());

        System.out.println("Código do Funcionário: " + funcionario.getCodigo());
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Endereço: " + funcionario.getEndereco());
        System.out.println("Telefone: " + funcionario.getTelefone());
        System.out.println("E-mail: " + funcionario.getEmail());
        System.out.println("Conta Bancária: " + funcionario.getConta());\
    }
}


////////////////////////////////////////////////////////////////////////////////

package exercicio1;

public class ContaBancaria {

    private String banco;
    private int agencia;
    private int numero;
    private String tipo;
    private Double saldo;
    private Double limite;


    //metodos de acesso

    public ContaBancaria(String banco, int agencia, int numero, String tipo, Double saldo, Double limite) {
        this.banco = banco;
        this.agencia = agencia;
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = saldo;
        this.limite = limite;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "banco='" + banco + '\'' +
                ", agencia='" + agencia + '\'' +
                ", numero=" + numero +
                ", tipo='" + tipo + '\'' +
                ", saldo=" + saldo +
                ", limite=" + limite +
                '}';
    }

    //
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package exercicio1;

public class Funcionario {

    //metodos de acesso

    private int codigo;
    private String nome;
    private String endereco;
    private int telefone;
    private String email;
    private int conta;

    public Funcionario(int codigo, String nome, String endereco, int telefone, String email, int conta) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.conta = conta;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone=" + telefone +
                ", email='" + email + '\'' +
                ", conta=" + conta +
                '}';
    }
}

//Commits on Sep 6, 2025
