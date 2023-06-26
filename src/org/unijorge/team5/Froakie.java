package org.unijorge.team5;
import org.unijorge.core.Ataque;
import org.unijorge.core.Pokemon;
import org.unijorge.core.enums.Sexo;
import org.unijorge.core.interfaces.Agua;

 public class Froakie extends Pokemon implements Agua{

  
  public Froakie(int idade, double peso, double tamanho, Sexo sexo, String nomeCientifico, int level, int levelProgress, int hp, Ataque atk, int def, int spd, int acuracia){
    super(idade, peso, tamanho, sexo, nomeCientifico, level, levelProgress, hp, atk, def, spd, acuracia);
 }
     public String desenhoPokemon(){
        return "(*)_(*)";

    } 
 
}
