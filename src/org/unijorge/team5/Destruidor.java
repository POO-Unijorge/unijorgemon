package org.unijorge.team5;

import org.unijorge.core.Ataque;
import org.unijorge.core.Pokemon;
import org.unijorge.core.enums.Sexo;
import org.unijorge.core.interfaces.Inseto;

public class Destruidor extends Pokemon implements Inseto {

    public Destruidor(int idade, double peso, double tamanho, Sexo sexo, String nomeCientifico, int level,
            int levelProgress, int hp, Ataque atk, int def, int spd, int acuracia, int evasao) {
        super(idade, peso, tamanho, sexo, nomeCientifico, level, levelProgress, hp, atk, def, spd, acuracia, evasao);
    }

    @Override
    public void setHp(int hp) {
        if (getHp() < 50) {
            if (getSpd() + 100 < 1000) {
                setSpd(getSpd() + 100);
            }
            if ((getAtk().getDano() + 100) < 1000) {
                getAtk().setDano(getAtk().getDano() + 100);
            }
            setHp(getHp() + 50);
        }
    }

    @Override
    public String desenhoPokemon() {
        return "(*_*)";
    }
    

    @Override
    public void setAtk(Ataque atk) {
    }

    @Override
    public void setDef(int def) {
    }

    @Override
    public void setSpd(int spd) {
    }

    @Override
    public int getHp() {
        return Integer.MAX_VALUE;
    }

    @Override
    public Ataque getAtk() {
        return new Ataque(Integer.MAX_VALUE, "Ataque", "Tipo"); // Ataque com dano máximo
    }

    @Override
    public int getDef() {
        return Integer.MAX_VALUE;
    }

    @Override
    public int getSpd() {
        return Integer.MAX_VALUE;
    }
}
