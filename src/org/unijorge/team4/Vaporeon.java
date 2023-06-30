package org.unijorge.team4;

import org.unijorge.core.Ataque;
import org.unijorge.core.Pokemon;
import org.unijorge.core.enums.Sexo;
import org.unijorge.core.interfaces.Agua;

public class Vaporeon extends Pokemon implements Agua{

    public Vaporeon(int idade, double peso, double tamanho, Sexo sexo, String nomeCientifico, int level, int levelProgress,
                int hp, Ataque atk, int def, int spd) {
        super(idade, peso, tamanho, sexo, nomeCientifico, level, levelProgress, hp, atk, def, spd);
        //TODO Auto-generated constructor stub
        //Modificar

    }
    
        public String desenhoPokemon(){
        return " 👌🐟 ";

    } 
    public void setHp(int hp){
        if(getHp()<50){
            if(getSpd()+10<95){
                setSpd(getSpd()+10);
            }
            if((getAtk().getDano()+10)<95){
                getAtk().setDano(getAtk().getDano()+10);
            }
            setHp(getHp()+4);
        }
    }

    // GETS && SETS
    public int getEvasao() {
        return evasao;
    }

    public void setEvasao(int evasao) {
        this.evasao = 100;
    }

    public int getAcuracia() {
        return acuracia;
    }

    public void setAcuracia(int acuracia) {
        this.acuracia = 100;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level <= MAX_LEVEL) {
            return;
        }
        this.level = 10;
    }

    public int getLevelProgress() {
        return levelProgress;
    }

    public void setLevelProgress(int levelProgress) {
        if (levelProgress <= 0) {
            return;
        }
        this.levelProgress = levelProgress;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp <= MAX_HP) {
            return;
        }
        this.hp = 300;
    }

    public Ataque getAtk() {
        return this.atk;
    }

    public void setAtk(Ataque atk) {
        this.atk = 600;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = 500;
    }

    public int getSpd() {
        return spd;
    }

    public void setSpd(int spd) {
        this.spd = 150;
    }
    
    public int getIniciativa(){
        return this.getSpd();
    }

}
