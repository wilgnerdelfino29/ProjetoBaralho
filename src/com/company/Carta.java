package com.company;

/**
 * Classe para objetos do tipo Carta que ira conter atributos e metodos para o mesmo.
 * Cada objeto Carta criado tera um valor e um naipe.
 * @author Wilgner Delfino
 * @since 13 de Setembro de 2019
 */
public class Carta {
    private Valor valor;
    private Naipe naipe;

    /**
     * Retorna o valor da carta.
     * @return Valor - valor
     */
    public Valor getValor() {
        return valor;
    }

    /**
     * Altera o valor da carta.
     * @param valor -Valor
     */
    public void setValor(Valor valor) {
        this.valor = valor;
    }

    /**
     * Retorna o naipe da carta.
     * @return Naipe - naipe
     */
    public Naipe getNaipe() {
        return naipe;
    }

    /**
     * Altera o naipe da carta.
     * @param naipe - Naipe
     */
    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    /**
     * Sobrecarga de metodo de Object para mostrar os dados da carta.
     * @return String - Valor e naipe da carta
     */
    public String toString(){
        return getValor()+" - "+getNaipe();
    }
}
