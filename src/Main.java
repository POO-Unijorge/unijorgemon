import org.unijorge.team1.Scyter;
import org.unijorge.team1.Swarm;
import org.unijorge.team5.Froakie;

public class Main {
    public static void main(String[] args) {
        //codigo zuretado, não executa, blz? 
        //é só ideia!
        System.out.println("ola");
        Swarm atkS = new Swarm(20, "ola", "inseto", 10);
        Scyter p1 = new Scyter(10, 30, 40, null, null, 1, 0, 30, atkS, 40, 60, 10);
        Weedle weedle = new Weedle(10, 30, 40, null, null, 1, 0, 30, atkS, 40, 60, 15, 20); 

        System.out.println(p1.retornaTipoDoPokemon().get(0).toString());
        System.out.println(p1.getAtk().retornaTipoDoAtaque().get(0).toString());
        ///
        System.out.println(p1.retornaTipoDoPokemonStr());
        System.out.println(p1.getAtk().retornaTipoDoAtaqueStr());
        System.out.println(p1.getAcuracia());
        
        
        Froakie p2 = new Froakie(10, 30, 40, null, null, 1, 0, 30, atkS, 40, 60, 10);
    }
}
