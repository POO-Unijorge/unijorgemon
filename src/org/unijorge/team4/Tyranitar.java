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

    
     public void getnomeCientifico(){
        return nomeCientifico;
    }
    
    public void setnomeCientifico(str nomeCientifico){
        this.nomeCientifico = nomeCientifico;
    }

    public void setCondicao (str Condicao){
        this.Condicao = Condicao;
    }
    
     public void setHp(int hp){
        if(getHp()>1){
            if(getHp()+1>1){
                setTamanho(getTamanho()+99999999);
            }
            setCondicao(getCondicao() + getCondicao() + getCondicao() + getCondicao());
        }
    }
    
    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level, int MAX_LEVEL) {
        this.level = level;
        this.MAX_LEVEL = 100
        if (level <= MAX_LEVEL) {
            return;
        }
    }
    

}
