import org.unijorge.core.Ataque;
import org.unijorge.core.Pokemon;
import org.unijorge.core.enums.Sexo;
import org.unijorge.core.interfaces.Inseto;

public class Weedle extends Pokemon implements Inseto{

    public Weedle(int idade, double peso, double tamanho, Sexo sexo, String nomeCientifico, int level,
            int levelProgress, int hp, Ataque atk, int def, int spd, int acuracia) {
        super(idade, peso, tamanho, sexo, nomeCientifico, level, levelProgress, hp, atk, def, spd, acuracia);
        //TODO Auto-generated constructor stub
    }

    public String desenhoPokemon(){
        return "(*)_(*)";

    }
}