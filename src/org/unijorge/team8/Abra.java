package org.unijorge.team8;

import org.unijorge.core.Ataque;
import org.unijorge.core.Pokemon;
import org.unijorge.core.enums.Sexo;
import org.unijorge.core.interfaces.Psiquico;

public class Abra extends Pokemon implements Psiquico {

    public Abra(int idade, double peso, double tamanho, Sexo sexo, String nomeCientifico, int level, int levelProgress,
            int hp, Ataque atk, int def, int spd, int acuracia, int evasao) {
        super(idade, peso, tamanho, sexo, nomeCientifico, level, levelProgress, hp, atk, def, spd, acuracia, evasao);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String desenhoPokemon() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    
}
