package org.unijorge.core;

public class Pokemon extends Animal {
    private int level;
    private int levelProgress;
    private int hp;
    private int atk;
    private int def;
    private int spd;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level <= 0) {
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
        if (hp <= 0) {
            return;
        }
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        if (atk <= 0) {
            return;
        }
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        if (def <= 0) {
            return;
        }
        this.def = def;
    }

    public int getSpd() {
        return spd;
    }

    public void setSpd(int spd) {
        if (spd <= 0) {
            return;
        }
        this.spd = spd;
    }

    public Pokemon(
        int idade, double peso, double tamanho, String sexo,
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
}
