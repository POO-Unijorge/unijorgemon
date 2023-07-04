package org.unijorge.team2;
import org.unijorge.core.Ataque;
import org.unijorge.core.Pokemon;
import org.unijorge.core.enums.Sexo;
import org.unijorge.core.interfaces.Normal;

public class Porygon extends Pokemon implements Normal{

	private Trace trace = new Trace(12, "Trace", 12);

	public Porygon (int idade, double peso, double tamanho, Sexo sexo, String nomeCientifico, int level,
            int levelProgress, int hp, int def, int spd, int acuracia, int evasao) {
		super(idade, peso, tamanho, sexo, nomeCientifico, level, levelProgress, hp, def, spd, acuracia, evasao);
		super.setAtk(trace);
	}

	
	
	public String getNomeHabilidade(){
		return trace.getNomeHabilidade();
	}
	public String desenhoPokemon(){
        return "(*)_(*)";
    }
	
	public int getDano(){
		return trace.getDano();
	}

	public double getpBaseAtaque(){
		return trace.getpBaseAtaque();
	}


}
