package org.unijorge.team4;
import org.unijorge.core.Ataque;
import org.unijorge.core.Pokemon;
import org.unijorge.core.enums.Sexo;
import org.unijorge.core.interfaces.Venenoso;

public class Zubat extends Pokemon implements Venenoso{

    public Zubat(int idade, double peso, double tamanho, Sexo sexo, String nomeCientifico, int level, int levelProgress,
                int hp, Ataque atk, int def, int spd) {
        super(idade, peso, tamanho, sexo, nomeCientifico, level, levelProgress, hp, atk, def, spd);
        //TODO Auto-generated constructor stub
        //Modificar

    }
    
        public String desenhoPokemon(){
        return "🦇";

    } 

    // BAGUNÇA PRO SEU CÓDIGO ABAIXO, OLHE COM CUIDADO DIEGO:







    public void getnomeCientifico(){
        return nomeCientifico
    }
    
    public void setnomeCientifico(str nomeCientifico){
        this.nomeCientifico = Agumon
    }

    public void setCondicao (str Condicao){
        this.Condicao = "nãe negocio vidas"
    }
    
     public void setHp(int hp){
        if(getHp()>1){
            if(getHp()+1>1){
                setTamanho(getTamanho()+777);
            }
            setCondicao(getCondicao() + getCondicao() + getCondicao() + getCondicao());
        }
    }
    
    public int getLevel() {
        return level = 2;
    }

    public void setLevel(int level, int MAX_LEVEL) {
        this.level = 1
        this.MAX_LEVEL = 10
        if (level <= MAX_LEVEL) {
            return;
        }
        this.level = 6969;
    }
    

}
