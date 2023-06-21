package org.unijorge.team2;

import org.unijorge.core.Ataque;
import org.unijorge.core.Pokemon;
import org.unijorge.core.enums.Sexo;
import org.unijorge.core.interfaces.Inseto;

public class Scyter extends Pokemon implements  Inseto{


    public Scyter(int idade, double peso, double tamanho, Sexo sexo, String nomeCientifico, int level,
            int levelProgress, int hp, Ataque atk, int def, int spd) {
        super(idade, peso, tamanho, sexo, nomeCientifico, level, levelProgress, hp, atk, def, spd);
        //TODO Auto-generated constructor stub
    }

    public void setHp(int hp){
        if(getHp()<50){
            if(getSpd()+10<95){
                setSpd(getSpd()+10);
            }
            if((getAtk().getDano()+10)<95){
                getAtk().setDano(getAtk().getDano()+10);
            }
            setHp(getHp()+4);
        }
    }


}
