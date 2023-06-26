package org.unijorge.team5;
import org.unijorge.core.Ataque;
import org.unijorge.core.interfaces.Agua;

public class Bubbles extends Ataque implements Agua {
    public Bubbles(int dano, String nome, String tipo, double pBaseAtaque) {
        super(dano, nome, tipo, pBaseAtaque);
    }

    public int getDano() {
        return super.getDano();
    }

    public void setDano(int dano) {
        super.setDano(dano);
    }

    public String getNome() {
        return "Bubbles";
    }

    public void setNome(String nome) {
        // Não é necessário definir o nome novamente, já que é fixo como "Bubbles"
    }

    public String getTipo() {
        return "Agua";
    }

    public void setTipo(String tipo) {
        // Não é necessário definir o tipo novamente, já que é fixo como "Agua"
    }

    public double getPBaseAtaque() {
        return super.getpBaseAtaque();
    }

    public void setPBaseAtaque(double pBaseAtaque) {
        super.setpBaseAtaque(pBaseAtaque);
    }
}
