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
    
	    public void setIdade(){
		    this.idade = 12;
	}
	    public void setPeso(){
			this.peso = 90.5;
		}
		public void setTamanho(){
			this.tamanho = 1.70;
		}
		public void setAtk(){
			this.atk;
		}
		public int getIdade(){
			return idade;
			}
        public double getPeso(){
			return peso;
		}
		public double getTamanho(){
			return tamanho;
		}
		public Ataque getAtk(){
			return atk;
		}

	    public String desenhoPokemon(){
        return "(*)_(*)";

    } 
   {
	setHp(MAX_HP);
   }

}
