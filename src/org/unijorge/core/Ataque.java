public class Ataque{
    private int dano;
    private String nome;

    // Procurar a melhor forma
    private String tipo;
    
    public void setDano(int dano) {
		this.dano = dano;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getDano(){
        return this.dano;
    }

    public String getNome(){
        return this.nome;
    }

    public String getTipo(){
        return this.tipo;
    }
   
}