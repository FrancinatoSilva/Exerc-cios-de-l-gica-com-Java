package testes;

import domain.Carro;

public class exercicioClasses {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro1 = new Carro();

        carro.nome = "Siena";
        carro.modelo = "Fire";
        carro.ano = 2008;

        carro1.nome = "Corolla";
        carro1.modelo = "XEI";
        carro1.ano = 2015;

        System.out.printf("O primeiro carro é um %s modelo %s de %d", carro.nome, carro.modelo, carro.ano);
        System.out.println();
        System.out.printf("O segundo carro é um %s modelo %s de %d", carro1.nome, carro1.modelo, carro1.ano);


    }
}
