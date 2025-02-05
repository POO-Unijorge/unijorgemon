package org.unijorge.core;
import java.util.ArrayList;

import org.unijorge.core.enums.Sexo;
import org.unijorge.utils.Utils;

//import java.util.ArrayList;
// OS TIPOS DOS ATAQUES SERÃO CORRESPONDENTES AOS TIPOS DOS POKEMON (Ex. Tipo ÁGUA == Ataque ÁGUA)

public abstract class Pokemon extends Animal {
    protected int level;
    protected int levelProgress;
    protected int hp;
    protected Ataque atk;
    protected int def;
    protected int spd;
    //Colocar Evasao do Pokemon Mediante
    protected int evasao;
    protected int acuracia;
    public static int MAX_ATK= 10;
    public static int MAX_HP= 10;
    public static int MAX_DEF= 10;
    public static int MAX_SPD= 10;
    public static int MAX_LEVEL= 10;

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
        if (atk == null) {
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

    //nao mudem a interface deste metodo
    public int getIniciativa(){
        //depois coloquem um random para variar
        return this.getSpd();
    }
    /**
     * @deprecated
     * @param idade
     * @param peso
     * @param tamanho
     * @param sexo
     * @param nomeCientifico
     * @param level
     * @param levelProgress
     * @param hp
     * @param atk
     * @param def
     * @param spd
     * @param acuracia
     * @param evasao
     */
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
    
    public Pokemon(
        int idade, double peso, double tamanho, Sexo sexo,
        String nomeCientifico, int level, int levelProgress,
        int hp, Ataque atk, int def, int spd, int acuracia, int evasao
    ) {
        super(idade, peso, tamanho, sexo, nomeCientifico);
        //tirar isso daqui!!! depois...
        this.acuracia = acuracia;
        this.evasao = 1;
        ///
        this.level = level;
        this.levelProgress = levelProgress;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spd = spd;
    }

    public Pokemon(int idade, double peso, double tamanho, Sexo sexo, String nomeCientifico, int level2,
            int levelProgress2, int hp2, Ataque atk2, int def2, int spd2, int acuracia2) {
        super(idade, peso, tamanho, sexo, nomeCientifico);
    }

    // Construtor sem a Classe ATAQUE -- Team2
    public Pokemon(int idade, double peso, double tamanho, Sexo sexo, String nomeCientifico, int level,
            int levelProgress, int hp, int def, int spd, int acuracia, int evasao) {
        super(idade, peso, tamanho, sexo, nomeCientifico);
        this.acuracia = acuracia;
        this.evasao = evasao;
        this.level = level;
        this.levelProgress = levelProgress;
        this.hp = hp;
        this.def = def;
        this.spd = spd;
    }

    @Override
    public String toString() {
        return "Pokemon [level=" + level + ", levelProgress=" + levelProgress + ", hp=" + hp + ", atk=" + atk + ", def="
                + def + ", spd=" + spd + "]";
    }

    /**
     * 
     * @param clazz
     * @return
     */ 
    private ArrayList<Class<?>> getImplementedInterfaces(Class<?> clazz){

        ArrayList<Class<?>> interfaces = new ArrayList<>();

        while (clazz != null) {
            Class<?>[] implementedInterfaces = clazz.getInterfaces();
            for (Class<?> iface : implementedInterfaces) {
                interfaces.add(iface);
            }
            clazz = clazz.getSuperclass();
        }

        return interfaces;
    }

    //as classes filhas vao poder acessar este método publico
    public ArrayList<Class<?>> retornaTipoDoPokemon(){
        return Utils.RetornaInterfaces.getImplementedInterfaces(getClass());
    } 
    
    public String retornaTipoDoPokemonStr(){
        return Utils.removerUltimaPalavraAposUltimoPonto(Utils.RetornaInterfaces.getImplementedInterfaces(getClass()).toString());
    }

    public abstract String desenhoPokemon();

}
