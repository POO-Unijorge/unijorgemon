
public abstract class Animal {
    private int idade;
    private double peso;
    private double tamanho;
    private String sexo;
    private String nomeCientifico;
    private String condicao;

    //TODO: Fazer tratamento de dados em Getters e Setters

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade <= 0) {
            return;
        }
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            return;
        }
        this.peso = peso;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        if (tamanho <= 0) {
            return;
        }
        this.tamanho = tamanho;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if (!sexo.equals("m") && !sexo.equals("f")) {
            return;
        }
        this.sexo = sexo;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    public Animal(int idade, double peso, double tamanho, String sexo, String nomeCientifico) {
        this.idade = idade;
        this.peso = peso;
        this.tamanho = tamanho;
        this.sexo = sexo;
        this.nomeCientifico = nomeCientifico;
        this.condicao = "saudável";
    }
}
