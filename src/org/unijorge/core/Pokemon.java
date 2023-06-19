package org.unijorge.core;


//import java.util.ArrayList;
// OS TIPOS DOS ATAQUES SERÃO CORRESPONDENTES AOS TIPOS DOS POKEMON (Ex. Tipo ÁGUA == Ataque ÁGUA)

public class Pokemon extends Animal {
    private int level;
    private int levelProgress;
    private int hp;
    private Ataque atk;
    private int def;
    private int spd;
    private int evasao;
    private int acuracia;
    
    public int getEvasao() {
        return evasao;
    }

    public void setEvasao(int evasao) {
        this.evasao = evasao;
    }

    public int getAcuracia() {
        return acuracia;
    }

    public void setAcuracia(int acuracia) {
        this.acuracia = acuracia;
    }

    public static int MAX_ATK= 10;
    public static int MAX_HP= 10;
    public static int MAX_DEF= 10;
    public static int MAX_SPD= 10;
    public static int MAX_LEVEL= 10;
    //public ArrayList<String> 

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level <= MAX_LEVEL) {
            return;
        }
        this.level = level;
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
        this.hp = hp;
    }

    public Ataque getAtk() {
        return this.atk;
    }

    public void setAtk(Ataque atk) {
        if (atk != null) {
            return;
        }
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        if (def <= MAX_DEF) {
            return;
        }
        this.def = def;
    }

    public int getSpd() {
        return spd;
    }

    public void setSpd(int spd) {
        if (spd <= MAX_SPD) {
            return;
        }
        this.spd = spd;
    }

    public Pokemon(
        int idade, double peso, double tamanho, Sexo sexo,
        String nomeCientifico, int level, int levelProgress,
        int hp, Ataque atk, int def, int spd
    ) {
        super(idade, peso, tamanho, sexo, nomeCientifico);
        //tirar isso daqui!!! depois...
        this.acuracia = 100;
        this.evasao = 100;
        ///
        this.level = level;
        this.levelProgress = levelProgress;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spd = spd;
    }

    @Override
    public String toString() {
        return "Pokemon [level=" + level + ", levelProgress=" + levelProgress + ", hp=" + hp + ", atk=" + atk + ", def="
                + def + ", spd=" + spd + "]";
    }
    
}
