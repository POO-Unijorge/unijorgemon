import org.unijorge.core.Ataque;
import org.unijorge.team2.Scyter;

public class Main {
    public static void main(String[] args) {
        //codigo zuretado, não executa, blz? 
        //é só ideia!
        System.out.println("ola");
        Scyter p1 = new Scyter(10, 30, 40, null, null, 1, 0, 30, new Ataque(20, null, "inseto", 10), 40, 60);
        Scyter p2 = new Scyter(10, 30, 40, null, null, 1, 0, 30, new Ataque(20, null, "inseto", 10), 40, 60);
        System.out.println(p1.retornaTipoDoPokemon().get(0).toString());
    }
}
