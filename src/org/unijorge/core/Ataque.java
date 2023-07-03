package org.unijorge.core;

import java.util.ArrayList;

import org.unijorge.core.enums.Sexo;
import org.unijorge.utils.Utils;

public class Ataque {
    protected int dano;
    protected String nome;
    protected String tipo;    
    protected double pBaseAtaque;

    //não precisa por o nome do tipo mais é feito automaticamente
    /**
     * @deprecated
     * @param dano
     * @param nome
     * @param tipo
     * @param pBaseAtaque
     */
    public Ataque(int dano, String nome, String tipo, double pBaseAtaque){
        this.dano = dano;
        this.nome = nome;
        this.tipo = retornaTipoDoAtaque().get(0).toString();
        this.pBaseAtaque = pBaseAtaque;
    }

    /**
     * 
     * @param dano
     * @param nome
     * @param pBaseAtaque
     */
    public Ataque(int dano, String nome, double pBaseAtaque){
        this.dano = dano;
        this.nome = nome;
        this.pBaseAtaque = pBaseAtaque;
    }

    public Ataque(int idade, double peso, double tamanho, Sexo sexo, String nomeCientifico, int level,
            int levelProgress, int hp, Ataque atk, int def, int spd, int acuracia) {
    }

    /**
     * Retorna o dano
     * @return int
     */
    public int getDano() {
        return dano;
    }

    /**
     * Retorna o dano
     * @param dano
     */
    public void setDano(int dano) {
        this.dano = dano;
    }

    /**
     * Retorna nome do ataque
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     * Ajusta o nome do ataque
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o tipo do ataque
     * @return
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Já temos reflexao
     * @deprecated
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = retornaTipoDoAtaque().get(0).toString();
    }

    /**
     * Retorna o ponto base do ataque
     * @return
     */
    public double getpBaseAtaque() {
        return this.pBaseAtaque;
    }

    /**
     * ajusta o pbase ataque
     * @param pBaseAtaque
     */
    public void setpBaseAtaque(double pBaseAtaque) {
        this.pBaseAtaque = pBaseAtaque;
    }

    /**
     * retorna o tipo do ataque por arraylist, todos os tipos
     * @return
     */
    public ArrayList<Class<?>> retornaTipoDoAtaque(){
        return Utils.RetornaInterfaces.getImplementedInterfaces(getClass());
    }

    /**
     * retorna todos o primeiro tipo de ataque pela interface
     * @return
     */
    public String retornaTipoDoAtaqueStr(){
        return Utils.removerUltimaPalavraAposUltimoPonto(Utils.RetornaInterfaces.getImplementedInterfaces(getClass()).toString());
    }
    
}