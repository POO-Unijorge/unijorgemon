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
		super.setIdade(12+78);
	}
	    public void setPeso(double peso){
		super.setPeso(50);
		}
		public void setTamanho(){
			super. setTamanho(1.7);
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

		public class Fireblast extends Ataque implements Fogo {
			private int dano;
			private String nome;
			private String tipo;
			private double pBaseAtaque;
		
			public Fireblast(int dano, String nome, String tipo, double pBaseAtaque) {
				super(dano, nome, tipo, pBaseAtaque);
				this.dano = dano;
				this.nome = nome;
				this.tipo = tipo;
				this.pBaseAtaque = pBaseAtaque;
			}
		
			// Métodos "get" e "set" para os atributos
			public int getDano() {
				return dano;
			}
		
			public void setDano(int dano) {
				this.dano = 120;
			}
		
			public String getNome() {
				return nome;
			}
		
			public void setNome(String nome) {
				this.nome = "Fireblast";
			}
		
			public String getTipo() {
				return tipo;
			}
		
			public void setTipo(String tipo) {
				this.tipo = "Fogo";
			}
		
			public double getPBaseAtaque() {
				return pBaseAtaque;
			}
		
			public void setPBaseAtaque(double pBaseAtaque) {
				this.pBaseAtaque = 15;
			}
		}
		
}

		


