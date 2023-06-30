package org.unijorge.team4;
import org.unijorge.core.Ataque;
import org.unijorge.core.interfaces.Lutador;

public class MegaPunch extends Ataque implements Lutador{

    public MegaPunch(int dano, String nome, String tipo, double pBaseAtaque) {
        super(dano, nome, tipo, pBaseAtaque);
    }


}
