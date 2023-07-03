package org.unijorge.team5;
import org.unijorge.core.Ataque;
import org.unijorge.core.Pokemon;
import org.unijorge.core.enums.Sexo;
import org.unijorge.core.interfaces.Fogo;

 public class Fennekin extends Pokemon implements Fogo{

  
     public Fennekin(int idade, double peso, double tamanho, Sexo sexo, String nomeCientifico, int level,
            int levelProgress, int hp, Ataque atk, int def, int spd, int acuracia) {
        super(idade, peso, tamanho, sexo, nomeCientifico, level, levelProgress, hp, atk, def, spd, acuracia);
        //TODO Auto-generated constructor stub
    }

    void a_blaze(){
      getAtk().setDano(getAtk().getDano()+10);
    }
     public void setHp(int hp){
        if(hp < 20){
           a_torrent(); 
        }
     }


    public String desenhoPokemon(){
        return "(*)_(*)";

    } 
 
}
