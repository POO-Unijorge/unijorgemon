package org.unijorge.core;

public class Ataque {
    private int dano;
    private String nome;
    
    //  chance de acerto = pbatk x acuraatkante/evesoponente
    //      0            =  1    x   100/100
    //      0            =  1    x    1
    //      1            =  1
    //      -----------------
    //   random falha critica 1 a 10 ou 20
    //   1 já era, o maximo acerta.
    //verificar interface
    private String tipo; 
    
    private double pBaseAtaque;


    public Ataque(int dano, String nome, String tipo, double pBaseAtaque){
        this.dano = dano;
        this.nome = nome;
        this.tipo = tipo;
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
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getpBaseAtaque() {
        return this.pBaseAtaque;
    }
    public void setpBaseAtaque(double pBaseAtaque) {
        this.pBaseAtaque = pBaseAtaque;
    }
}