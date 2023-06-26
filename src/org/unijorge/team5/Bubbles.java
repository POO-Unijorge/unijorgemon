package org.unijorge.team5;
import org.unijorge.core.Ataque;
import org.unijorge.core.interfaces.Agua;

public class Bubbles extends Ataque implements Agua {
    
 public bubbles(){
  private int dano;
  private String nome;
  private String tipo; 
  private double pBaseAtaque;

  public Bubbles(int dano, String nome, String tipo, double acerto){
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
        this.nome = "Bubbles";
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = "Agua";
    }
    public double getPBaseAtaque() {
        return pBaseAtaque;
    }
    public void setPBaseAtaque(double pBaseAtaque) {
        this.pBaseAtaque = pBaseAtaque;
    }

 }
  public Bubbles(int dano, String nome, String tipo, double pBaseAtaque) {
        super(dano, nome, tipo, pBaseAtaque);
        //TODO Auto-generated constructor stub
    }

    
}
