package org.unijorge.team2;
import org.unijorge.core.Ataque;
import org.unijorge.core.interfaces.Normal;

public class Trace extends Ataque implements Normal{
    private String nomeHabilidade = "Trace";

    public Trace(int dano, String nome, double pBaseAtaque) {
        super(dano, nome, pBaseAtaque);
    }

    public String getNomeHabilidade() {
        return nomeHabilidade;
    }

    public void setNomeHabilidade(String nomeHabilidade) {
        this.nomeHabilidade = nomeHabilidade;
    }

}
