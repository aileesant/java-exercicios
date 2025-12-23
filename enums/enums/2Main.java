package enum2;

public class Main {
    public static void main(String[] args) {
                Funcionario f1 = new Funcionario(
                        1,
                        "Aline",
                        5300.00,
                        Setor.MARKETING,   // ✅ usa o ENUM Setor
                        Sexo.FEMININO,     // ✅ usa o ENUM Sexo
                        18
                );

                Funcionario f2 = new Funcionario(
                        2,
                        "Yuta",
                        4200.00,
                        Setor.VENDAS,
                        Sexo.MASCULINO,
                        26
                );

                System.out.println(f1);
                System.out.println(f2);
    }
}

//Commits on Sep 12, 2025
