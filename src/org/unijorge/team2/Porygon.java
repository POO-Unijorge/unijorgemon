package org.unijorge.team2;
import org.unijorge.core.Ataque;
import org.unijorge.core.Pokemon;
import org.unijorge.core.enums.Sexo;
import org.unijorge.core.interfaces.Normal;

public class Porygon extends Pokemon implements Normal{

	public Porygon (int idade, double peso, double tamanho, Sexo sexo, String nomeCientifico, int level,
            int levelProgress, int hp, Ataque atk, int def, int spd, int acuracia, int evasao) {
		super(idade, peso, tamanho, sexo, nomeCientifico, level, levelProgress, hp, atk, def, spd, acuracia, evasao);
	}
	Trace trace = new Trace(12, "Ataque", 12);
	
	public String getNomeHabilidade(){
		return trace.getNomeHabilidade();
	}

	public String desenhoPokemon(){
        return "(*)_(*)";

    } 
}
