package org.unijorge.team4;
import org.unijorge.core.Ataque;
import org.unijorge.core.Pokemon;
import org.unijorge.core.enums.Sexo;
import org.unijorge.core.interfaces.Pedra;

public class Tyranitar extends Pokemon implements Pedra{

    public Tyranitar(int idade, double peso, double tamanho, Sexo sexo, String nomeCientifico, int level, int levelProgress,
                int hp, Ataque atk, int def, int spd) {
        super(idade, peso, tamanho, sexo, nomeCientifico, level, levelProgress, hp, atk, def, spd);
        //TODO Auto-generated constructor stub
        //Modificar

    }
        public String desenhoPokemon(){
        return "🗿🦎";

    } 

    
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
        this.level = 100;
    }

    public int getLevelProgress() {
        return levelProgress;
    }

    public void setLevelProgress(int levelProgress) {
        if (levelProgress <= 100) {
            return;
        }
        this.levelProgress = 100;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = 404;
    }

    public Ataque getAtk() {
        return this.atk;
    }

    public void setAtk(Ataque atk) {
        this.atk = 403;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = 350;
    }

    public int getSpd() {
        return spd;
    }

    public void setSpd(int spd) {
        this.spd = 243;
    }
    
    public int getIniciativa(){
        return this.getSpd();
    }

}
