package com.company;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Classe para objetos do tipo Baralho que ira conter um unico atributo e alguns metodos para o mesmo.
 * O objeto criado contera um ArrayList do tipo Cartas.
 * @author Wilgner Delfino
 * @since 13 de Setembro de 2019
 */
public class Baralho {
    private ArrayList<Carta> cartas = new ArrayList<>();

    /**
     * Construtor da classe responsavel por montar, embaralhar e exibir o baralho.
     */
    public Baralho(){
        montar();
        embaralhar();
        exibir();
    }

    /**
     * Metodo que cria 52 cartas diferentes, separadas em 4 naipes com 13 valores cada.
     * Apos criar uma carta a adiciona ao ArrayList.
     */
    private void montar(){
        for (Naipe n:Naipe.values()) {
            for (Valor v:Valor.values()) {
                Carta c = new Carta();
                c.setNaipe(n);
                c.setValor(v);
                cartas.add(c);
            }
        }
    }

    /**
     * Metodo para embaralhar o ArrayList usando um metodo de Collections.
     */
    private void embaralhar(){
        Collections.shuffle(cartas);
    }


    /**
     * Metodo que mostra as cartas do baralho.
     */
    private void exibir(){
        for (Carta carta : cartas) System.out.println(carta.toString());
    }
}
