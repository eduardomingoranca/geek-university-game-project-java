package com.brazil.geek.model;

import java.util.Random;

public class Calcular {
    private final int dificuldade;
    private final int valorUm;
    private final int valorDois;
    private final int operacao;
    private int resultado;

    public Calcular(int dificuldade) {
        Random rand = new Random();

        this.operacao = rand.nextInt(3); // 0 - adicionar, 1 - subtrair, 2 - multiplicar
        this.dificuldade = dificuldade;

        if (dificuldade == 1) {
            // facil
            this.valorUm = rand.nextInt(10); // 0 a 9
            this.valorDois = rand.nextInt(10); // 0 a 9
        } else if (dificuldade == 2) {
            // medio
            this.valorUm = rand.nextInt(100); // 0 a 99
            this.valorDois = rand.nextInt(100); // 0 a 99
        } else if (dificuldade == 3) {
            // dificil
            this.valorUm = rand.nextInt(1000); // 0 a 999
            this.valorDois = rand.nextInt(1000); // 0 a 999
        } else if (dificuldade == 4) {
            // insano
            this.valorUm = rand.nextInt(10000); // 0 a 9999
            this.valorDois = rand.nextInt(10000); // 0 a 9999
        } else {
            // ultra insano
            this.valorUm = rand.nextInt(100000); // 0 a 99999
            this.valorDois = rand.nextInt(100000); // 0 a 99999
        }
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public int getValorUm() {
        return valorUm;
    }

    public int getValorDois() {
        return valorDois;
    }

    public int getOperacao() {
        return operacao;
    }

    public int getResultado() {
        return resultado;
    }

    @Override
    public String toString() {
        String op;
        if (this.getOperacao() == 0)
            op = "Adicionar";
        else if (this.getOperacao() == 1)
            op = "Subtrair";
        else if (this.getOperacao() == 2)
            op = "Multiplicar";
        else op = "Operacao desconhecida";
        return "Valor 1: " + this.getValorUm() +
                "\nValor 2: " + this.getValorDois() +
                "\nDificuldade: " + this.getDificuldade() +
                "\nOperacao: " + op;
    }

    public boolean adicionar(int resposta) {
        this.resultado = this.getValorUm() + this.getValorDois();
        boolean certo = false;

        if (resposta == this.getResultado()) {
            System.out.println("Resposta correta!");
            certo = true;
        } else System.out.println("Resposta errada!");

        System.out.println(this.getValorUm() + " + " + this.getValorDois() + " = " + this.getResultado());
        return certo;
    }

    public boolean subtrair(int resposta) {
        this.resultado = this.getValorUm() - this.getValorDois();
        boolean certo = false;

        if (resposta == this.getResultado()) {
            System.out.println("Resposta correta!");
            certo = true;
        } else System.out.println("Resposta errada!");

        System.out.println(this.getValorUm() + " + " + this.getValorDois() + " = " + this.getResultado());
        return certo;
    }

    public boolean multiplicar(int resposta) {
        this.resultado = this.getValorUm() * this.getValorDois();
        boolean certo = false;

        if (resposta == this.getResultado()) {
            System.out.println("Resposta correta!");
            certo = true;
        } else System.out.println("Resposta errada!");

        System.out.println(this.getValorUm() + " + " + this.getValorDois() + " = " + this.getResultado());
        return certo;
    }

}
