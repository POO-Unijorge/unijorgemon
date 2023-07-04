package org.unijorge.team2;
import org.unijorge.core.Ataque;
import org.unijorge.core.interfaces.Dark;

public class FoulPlay extends Ataque implements Dark{

    public FoulPlay(int dano, String nome, String tipo, double pBaseAtaque) {
        super(dano, nome, tipo, pBaseAtaque);
        //TODO Auto-generated constructor stub
    }

    public void FouPlayAtk() {
        int damage = 95;
        hp -= damage;
    }



}
