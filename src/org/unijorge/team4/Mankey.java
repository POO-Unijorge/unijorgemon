package org.unijorge.team4;
import org.unijorge.core.Ataque;
import org.unijorge.core.Pokemon;
import org.unijorge.core.enums.Sexo;
import org.unijorge.core.interfaces.Lutador;

public class Mankey extends Pokemon implements Lutador{

    public Mankey(int idade, double peso, double tamanho, Sexo sexo, String nomeCientifico, int level, int levelProgress,
                int hp, Ataque atk, int def, int spd) {
        super(idade, peso, tamanho, sexo, nomeCientifico, level, levelProgress, hp, atk, def, spd);
        //TODO Auto-generated constructor stub
        //Modificar

    }
    
        public String desenhoPokemon(){
        return "🙈";

    } 


 // GETS && SETS
    
    public int getEvasao() {
        return evasao;
    }

    public void setEvasao(int evasao) {
        this.evasao = 56;
    }

    public int getAcuracia() {
        return acuracia;
    }

    public void setAcuracia(int acuracia) {
        this.acuracia = 56;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = 342;
    }

    public int getLevelProgress() {
        return levelProgress;
    }

    public void setLevelProgress(int levelProgress) {
        if (levelProgress <= 56) {
            return;
        }
        this.levelProgress = 100;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Ataque getAtk() {
        return this.atk;
    }

    public void setAtk(Ataque atk) {
        this.atk = 25;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = 899;
    }

    public int getSpd() {
        return spd;
    }

    public void setSpd(int spd) {
        this.spd = 1;
    }
    
    public int getIniciativa(){
        return this.getSpd();
    }

}
