package org.unijorge.team7;
import org.unijorge.core.Ataque;
import org.unijorge.core.Pokemon;
import org.unijorge.core.enums.Sexo;
import org.unijorge.core.interfaces.Noturno;

public class Zorua extends Pokemon{

    public Zorua(int idade, double peso, double tamanho, Sexo sexo, String nomeCientifico, int level, int levelProgress, int hp, Ataque atk, int def, int spd) {
        super(idade, peso, tamanho, sexo, nomeCientifico, level, levelProgress, hp, atk, def, spd);
    }

    @Override
    public String desenhoPokemon() {
        return null;
    }


}
