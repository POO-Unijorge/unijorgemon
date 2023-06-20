import org.unijorge.core.Ataque;
import org.unijorge.core.Pokemon;
import org.unijorge.core.enum.Sexo;
import org.unijorge.core.intefaces.Normal;

public class Eevee extends Pokemon implements Normal{

    public Eevee(int idade, double peso, double tamanho, Sexo sexo, String nomeCientifico, int level,
            int levelProgress, int hp, Ataque atk, int def, int spd) {
        super(idade, peso, tamanho, sexo, nomeCientifico, level, levelProgress, hp, atk, def, spd);
        //TODO Auto-generated constructor stub

    }
    /*
     * public static void main(String[] args){
     *  Eevee eevee = new Eevee(10,10,10,Sexo.F,"blablabla", 1, 0, 35, new Ataque(80, "Tackle", 100));
     * }
     */
}