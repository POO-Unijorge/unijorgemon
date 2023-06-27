package org.unijorge.team3;
import org.unijorge.core.Ataque;
import org.unijorge.core.Pokemon;
import org.unijorge.core.enums.Sexo;
import org.unijorge.core.interfaces.Fogo;

public class Charizard extends Pokemon{

	public Charizard (int idade, double peso, double tamanho, Sexo sexo, String nomeCientifico, int level,
			int levelProgress, int hp, Ataque atk, int def, int spd) {
		super(idade, peso, tamanho, sexo, nomeCientifico, level, levelProgress, hp, atk, def, spd);
	}
    
	    public String desenhoPokemon(){
        return "(*)_(*)";

    } 
        

}
