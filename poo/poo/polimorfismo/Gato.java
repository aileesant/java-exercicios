package org.example.polimorfismo.ex1;

public class Gato implements Animal {
    //gato vai implementar interface animal

    // alt + insert = implement methods

    @Override
    public String emitirSom() {
        return "Miauuuuuuuuu";
    }

    @Override
    public String comer() {
        return "Peixe";
    }
}
//Commits on Sep 13, 2025
