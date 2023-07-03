package org.unijorge.team2;
import org.unijorge.core.Ataque;
import org.unijorge.core.interfaces.Normal;

public class Trace extends Ataque implements Normal{
   

    public Trace(int dano, String nome, double pBaseAtaque) {
        super(dano, nome, pBaseAtaque);
    }

    public String getNomeHabilidade() {
        return nome;
    }

    public void setNomeHabilidade(String nome) {
        this.nome = nome;
    }

}
