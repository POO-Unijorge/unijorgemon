package org.unijorge.team3;

import org.unijorge.core.Ataque;
import org.unijorge.core.Pokemon;
import org.unijorge.core.enums.Sexo;
import org.unijorge.core.interfaces.Fogo;

public class Charizard extends Pokemon implements Fogo {

    public Charizard(int idade, double peso, double tamanho, Sexo sexo, String nomeCientifico, int level,
                     int levelProgress, int hp, Ataque atk, int def, int spd) {
        super(idade, peso, tamanho, sexo, nomeCientifico, level, levelProgress, hp, atk, def, spd);
    }

    // Métodos de configuração (set)

    public void setAtk(int atk) {
        this.atk = 50;
    }

    public void setDef(int def) {
        this.def = 50;
    }

    public void setSpd(int spd) {
        this.spd = 50;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = "Charizard";
    }

    public void setIdade(int idade) {
        super.setIdade(12 + 78);
    }

    public void setPeso(double peso) {
        super.setPeso(50);
    }

    public void setTamanho() {
        super.setTamanho(1.7);
    }

    public void setHp(int hp) {
        this.hp = 50;
    }

    public void setLevelProgress(int levelProgress) {
        this.levelProgress = 0;
    }

    public void setLevel(int level) {
        if (levelProgress == 100) {
            this.level = 1 + 1;
        } else {
            this.level = level;
        }
    }

    // Métodos de acesso (get)

    @Override
	public Ataque getAtk() {
		
		return super.getAtk();
	}
    

	@Override
	public int getDef() {
		// TODO Auto-generated method stub
		return super.getDef();
	}
    public int getSpd() {
        return spd;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

	@Override
	public int getIdade() {
		// TODO Auto-generated method stub
		return super.getIdade();
	}

	@Override
	public double getPeso() {
		// TODO Auto-generated method stub
		return super.getPeso();
	}
	@Override
	public double getTamanho() {
		// TODO Auto-generated method stub
		return super.getTamanho();
	}

    public int getHp() {
        return hp;
    }


    public int getLevelProgress() {
        return levelProgress;
    }

    public int getLevel() {
        return level;
    }

    public String desenhoPokemon() {
        return "(*)_(*)";
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
		
	
			
