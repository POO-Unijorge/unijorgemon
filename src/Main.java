import org.unijorge.core.Ataque;
import org.unijorge.core.Pokemon;
import org.unijorge.core.Sexo;
import org.unijorge.team3.Magikarp;

public class Main {
    public static void main(String[] args) {
        Eevee eevee = new Eevee(10, 20.0, 12.5, Sexo.F, "Eevee", 0, 0, 10, 5, 4, 9);
        System.out.println(eevee.toString());

        Magikarp magikarp = new Magikarp(50, 1, 1, Sexo.F, "Magikarpa", 0, 0, 1, new Ataque(1, "Swift Swim", "Agua", 1), 0, 0); 
    }
}
