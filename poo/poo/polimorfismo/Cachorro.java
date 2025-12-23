package org.example.polimorfismo.ex1;

public class Cachorro implements Animal {
    //cachorro vai implementar interface animal

    // alt + insert = implement methods

    @Override
    public String emitirSom() {
        return "AuAU AUAUAUUUU";
    }

    @Override
    public String comer() {
        return "Ração";
    }
}

//Commits on Sep 13, 2025
