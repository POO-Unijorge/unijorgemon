package org.unijorge.team4;

import org.unijorge.core.Ataque;
import org.unijorge.core.Pokemon;
import org.unijorge.core.enums.Sexo;
import org.unijorge.core.interfaces.Agua;

public class Vaporeon extends Pokemon implements Agua {

    public Vaporeon(int idade, double peso, double tamanho, Sexo sexo, String nomeCientifico, double level, int levelProgress,
            int hp, Ataque atk, int def, int spd) {
        super(idade, peso, tamanho, sexo, nomeCientifico, level, levelProgress, hp, atk, def, spd);
    }

    @Override
    public String desenhoPokemon() {
        return "👌🐟";
    }

    // GETTERS & SETTERS

    @Override
    public int getEvasao() {
        return evasao;
    }

    @Override
    public void setEvasao(int evasao) {
        this.evasao = 34;
    }

    @Override
    public int getAcuracia() {
        return acuracia;
    }

    @Override
    public void setAcuracia(int acuracia) {
        this.acuracia = 34;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void setLevel(double level) {
        this.level = 34;
    }

    @Override
    public int getLevelProgress() {
        return levelProgress;
    }

    @Override
    public void setLevelProgress(int levelProgress) {
        if (levelProgress <= 34) {
            this.levelProgress = 34;
        }
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = 34;
    }

    @Override
    public Ataque getAtk() {
        return this.atk;
    }

    @Override
    public void setAtk(Ataque atk) {
        this.atk = 34;
    }

    @Override
    public int getDef() {
        return def;
    }

    @Override
    public void setDef(int def) {
        this.def = 34;
    }

    @Override
    public int getSpd() {
        return spd;
    }

    @Override
    public void setSpd(int spd) {
        this.spd = 34;
    }

    @Override
    public int getIniciativa() {
        return this.getSpd();
    }
}
