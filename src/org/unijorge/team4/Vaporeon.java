package org.unijorge.team4;

import org.unijorge.core.Ataque;
import org.unijorge.core.Pokemon;
import org.unijorge.core.enums.Sexo;
import org.unijorge.core.interfaces.Agua;

public class Vaporeon extends Pokemon implements Agua{

    public Vaporeon(int idade, double peso, double tamanho, Sexo sexo, String nomeCientifico, int level, int levelProgress,
                int hp, Ataque atk, int def, int spd) {
        super(idade, peso, tamanho, sexo, nomeCientifico, level, levelProgress, hp, atk, def, spd);
        //TODO Auto-generated constructor stub
        //Modificar

    }
    
        public String desenhoPokemon(){
        return " 👌🐟 ";

    } 
}
