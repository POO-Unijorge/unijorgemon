package org.unijorge.core;

public class Ataque {
    private int dano;
    private String nome;
    
    //verificar interface
    private String tipo; 
    //tem que ve se vai ter isso mesmo
    private double acerto;

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
    public double getAcerto() {
        return acerto;
    }
    public void setAcerto(double acerto) {
        this.acerto = acerto;
    }
}