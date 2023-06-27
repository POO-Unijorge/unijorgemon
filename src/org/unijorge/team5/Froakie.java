package org.unijorge.team5;
import org.unijorge.core.Ataque;
import org.unijorge.core.Pokemon;
import org.unijorge.core.enums.Sexo;
import org.unijorge.core.interfaces.Agua;

 public class Froakie extends Pokemon implements Agua{

  
  
     public Froakie(int idade, double peso, double tamanho, Sexo sexo, String nomeCientifico, int level,
            int levelProgress, int hp, Ataque atk, int def, int spd, int acuracia) {
        super(idade, peso, tamanho, sexo, nomeCientifico, level, levelProgress, hp, atk, def, spd, acuracia);
        //TODO Auto-generated constructor stub
    }

    //Utilizando a ideia do professor so que com uma abilidade do proprio pokemon
    void a_torrent(){
      getAtk().setDano(getAtk().getDano()+10);
    }
     public void setHp(int hp){
        if(hp < 30){
           a_torrent(); 
        }
     }


    public String desenhoPokemon(){
        return "(*)_(*)";

    } 
 
}
