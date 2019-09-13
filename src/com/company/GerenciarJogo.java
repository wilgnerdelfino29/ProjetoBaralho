package com.company;

/**
 * Classe para gerenciar a execucao do programa.
 * Instancia um objeto do tipo Baralho.
 * @author Wilgner Delfino
 * @since 13 de Setembro de 2019
 */
public class GerenciarJogo {
    Baralho baralho = new Baralho();

    /**
     * Instancia um objeto do tipo GerenciarJogo.
     * @param args Argumentos pra linha de comando nao usado.
     */
    public static void main(String[] args) {
        System.out.println("Baralho: ");
        System.out.println();
        GerenciarJogo ger = new GerenciarJogo();
    }
}
