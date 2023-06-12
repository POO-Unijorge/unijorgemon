import org.unijorge.core.Pokemon;
import org.unijorge.core.Sexo;

public class Main {
    public static void main(String[] args) {
        Eevee eevee = new Eevee(10, 20.0, 12.5, Sexo.F, "Eevee", 0, 0, 10, 5, 4, 9);
        System.out.println(eevee.toString());
    }
}
