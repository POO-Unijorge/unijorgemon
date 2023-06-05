package org.unijorge.core;

//import java.util.ArrayList;

public class Pokemon extends Animal {
    private int level;
    private int levelProgress;
    private int hp;
    private int atk;
    private int def;
    private int spd;
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

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        if (atk <= MAX_ATK) {
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
        int hp, int atk, int def, int spd
    ) {
        super(idade, peso, tamanho, sexo, nomeCientifico);
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
