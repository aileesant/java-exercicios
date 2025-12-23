public class exercicio3 {
    public static void main(String[] args) {
        System.out.println("Números pares entre 100 e 120:");

        // laço de repetição
        for (int numero = 100; numero <= 120; numero++) {
            if (numero % 2 == 0) { // verifica se é par
                System.out.println(numero);
            }
        }
    }
}

//public class exercicio3 {
//    public static void main(String[] args) {
//        System.out.println("Números pares entre 100 e 120:");
//
//        // começa no 100 e vai até 120, pulando de 2 em 2
//        for (int numero = 100; numero <= 120; numero += 2) {
//            System.out.println(numero);
//        }
//    }
//}
