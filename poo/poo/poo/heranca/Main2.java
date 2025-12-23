package org.example.heranca.ex2;

public class Main {
    public static void main(String[] args) {

        Processador processador = new Processador("intel", "i9", 1324.7);
        Memoria memoria = new Memoria("intel", "i9", "24532");
        PlacaMae placaMae = new PlacaMae("UJGDA", "HGSJA", "JHGDJS");
        DispositivoDeArmazenamento dispositivoDeArmazenamento = new DispositivoDeArmazenamento("jahj", "hasjghd", "jdhsja", "agddg");

        System.out.println(placaMae);
        System.out.println(processador);
        System.out.println(memoria);
        System.out.println(dispositivoDeArmazenamento);
    }
}

Commits on Sep 13, 2025
