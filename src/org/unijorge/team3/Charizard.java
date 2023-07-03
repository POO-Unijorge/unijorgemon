package org.unijorge.team3;

import org.unijorge.core.Ataque;
import org.unijorge.core.Pokemon;
import org.unijorge.core.enums.Sexo;
import org.unijorge.core.interfaces.Fogo;

public class Charizard extends Pokemon implements Fogo{

	public Charizard (int idade, double peso, double tamanho, Sexo sexo, String nomeCientifico, int level,
			int levelProgress, int hp, Ataque atk, int def, int spd) {
		super(idade, peso, tamanho, sexo, nomeCientifico, level, levelProgress, hp, atk, def, spd);
	}
    
	public void setIdade(int idade) {
		this.idade = 12;
	}
	    public void setPeso(){
			this.peso = 50;
		}
		public void setTamanho(){
			this.tamanho = 1.70;
		}

	    public String desenhoPokemon(){
        return "(*)_(*)";

    	} 

		public void setHp(int hp) {
			this.hp = 50;
		}

		public void setlevelProgress(int levelProgress) {
			this.levelProgress = 0;
		}
		
		public void setLevel(int level) {
			if (levelProgress == 100) {
				this.level = 1 + 1;
			} else {
				this.level = level;
			}
		}
		


