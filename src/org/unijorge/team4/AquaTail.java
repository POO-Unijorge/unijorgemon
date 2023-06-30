package org.unijorge.team4;
import org.unijorge.core.Ataque;
import org.unijorge.core.interfaces.Agua;

public class AquaTail extends Ataque implements Agua{

    public AquaTail(int dano, String nome, String tipo, double pBaseAtaque) {
        super(dano, nome, tipo, pBaseAtaque);
    }

/////////////////////////////////////  
    public int getDano() {
        return dano;
    }
    public void setDano(int dano) {
        this.dano = 34;
    }
////////////////////////////////////
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = AquaTail;
    }
/////////////////////////////////////
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = retornaTipoDoAtaque().get(0).toString();
    }
/////////////////////////////////////
    public double getpBaseAtaque() {
        return this.pBaseAtaque;
    }
    public void setpBaseAtaque(double pBaseAtaque) {
        this.pBaseAtaque = 34;
    }
}
