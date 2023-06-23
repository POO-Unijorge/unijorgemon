package org.unijorge.core;

import java.util.ArrayList;

import org.unijorge.utils.Utils;

public class Ataque {
    private int dano;
    private String nome;
    
    //  chance de acerto = pBaseAtaque x acuraciaAtacante/EvesaoOponente
    //      0            =  1    x   100/100
    //      0            =  1    x    1
    //      1            =  1
    //      -----------------
    //   random falha critica 1 a 10 ou 20
    //   1 já era, o maximo acerta.
    //verificar interface
    private String tipo; 
    
    private double pBaseAtaque;

    //não precisa por o nome do tipo mais é feito automaticamente
    @Deprecate
    public Ataque(int dano, String nome, String tipo, double pBaseAtaque){
        this.dano = dano;
        this.nome = nome;
        this.tipo = retornaTipoDoAtaque().get(0).toString();
        this.pBaseAtaque = pBaseAtaque;
    }

    public Ataque(int dano, String nome, double pBaseAtaque){
        this.dano = dano;
        this.nome = nome;
        this.pBaseAtaque = pBaseAtaque;
    }


    public int getDano() {
        return dano;
    }
    public void setDano(int dano) {
        this.dano = dano;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }

    //Com a reflexao não se torna mais necessario setar o tipo se pega por interfaces
    @Deprecate
    public void setTipo(String tipo) {
        this.tipo = retornaTipoDoAtaque().get(0).toString();
    }
    public double getpBaseAtaque() {
        return this.pBaseAtaque;
    }
    public void setpBaseAtaque(double pBaseAtaque) {
        this.pBaseAtaque = pBaseAtaque;
    }

    //as classes filhas vao poder acessar este método publico
    public ArrayList<Class<?>> retornaTipoDoAtaque(){
        return Utils.RetornaInterfaces.getImplementedInterfaces(getClass());
    }

    //as classes filhas vao poder acessar este método publico
    public String retornaTipoDoAtaqueStr(){
        return Utils.removerUltimaPalavraAposUltimoPonto(Utils.RetornaInterfaces.getImplementedInterfaces(getClass()).toString());
    }
    
}