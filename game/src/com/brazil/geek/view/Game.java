package com.brazil.geek.view;

import com.brazil.geek.model.Calcular;

import java.util.Scanner;

public class Game {
    private static final Scanner teclado = new Scanner(System.in);
    private static int pontos = 0;
    static Calcular calcular;

    public static void main(String[] args) {
        jogar();
    }

    public static void jogar() {
        System.out.println("Informe o nivel de dificuldade desejado [1, 2, 3 ou 4]: ");
        int dificuldade = teclado.nextInt();

        calcular = new Calcular(dificuldade);

        System.out.println("Informe o resultado para a seguinte operacao: ");

        // adicionar
        if (calcular.getOperacao() == 0) {
            System.out.println(calcular.getValorUm() + " + " + calcular.getValorDois());
            int resposta = teclado.nextInt();

            if (calcular.adicionar(resposta)) {
                // Ganha 1 ponto
                pontos += 1;
                System.out.println("Voce tem " + pontos + " ponto(s).");
            }
        }

        // subtrair
        else if (calcular.getOperacao() == 1) {
            System.out.println(calcular.getValorUm() + " - " + calcular.getValorDois());
            int resposta = teclado.nextInt();

            if (calcular.subtrair(resposta)) {
                // Ganha 1 ponto
                pontos += 1;
                System.out.println("Voce tem " + pontos + " ponto(s).");
            }
        }

        // multiplicar
        else if (calcular.getOperacao() == 2) {
            System.out.println(calcular.getValorUm() + " * " + calcular.getValorDois());
            int resposta = teclado.nextInt();

            if (calcular.multiplicar(resposta)) {
                // Ganha 1 ponto
                pontos += 1;
                System.out.println("Voce tem " + pontos + " ponto(s).");
            }
        }

        else System.out.println("A operacao " + calcular.getOperacao() + " nao eh reconhecida.");

        System.out.println("Deseja continuar? [1 - sim, 0 - nao]");
        int continuar = teclado.nextInt();

        if (continuar == 1) jogar();
        else {
            System.out.println("Voce fez " + pontos + " ponto(s).");
            System.out.println("Ate a promixa!");
            System.exit(0);
        }

    }
}
