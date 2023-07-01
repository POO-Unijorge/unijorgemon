package org.unijorge.team8;

import org.unijorge.core.Ataque;
import org.unijorge.core.Pokemon;
import org.unijorge.core.enums.Sexo;

public class Koffing extends Pokemon {

    public Koffing(int idade, double peso, double tamanho, Sexo sexo, String nomeCientifico, int level,
            int levelProgress, int hp, Ataque atk, int def, int spd, int acuracia, int evasao) {
        super(idade, peso, tamanho, sexo, nomeCientifico, level, levelProgress, hp, atk, def, spd, acuracia, evasao);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String desenhoPokemon() {
        // TODO Auto-generated method stub
        return "((0)_(---)_(0))";
    }
    
}
