import org.unijorge.core.Arena;
import org.unijorge.core.Ataque;
import org.unijorge.core.Pokemon;
import org.unijorge.team1.Scyter;
import org.unijorge.team1.Swarm;
import org.unijorge.team5.Froakie;
import org.unijorge.team6.Eevee;
import org.unijorge.team6.Tackle;

public class Main {
    public static void main(String[] args) {
        //codigo zuretado, não executa, blz? 
        //é só ideia!
        
        Swarm atkS = new Swarm(20, "ola", "inseto", 10);
        Scyter scyter = new Scyter(10, 30, 40, null, "Scyter", 1, 0, 30, atkS, 40, 60, 10, 0);
        Weedle weedle = new Weedle(10, 30, 40, null, null, 1, 0, 30, atkS, 40, 60, 15, 20); 
        
        Eevee eevee = new Eevee(5, 20.0, 40.0, null, "Eevee", 1, 0, 55, new Ataque(50, "Tackle", 60), 50, 55, 15, 15);
        
        Arena arena = new Arena(scyter, eevee);

      

        //Froakie p2 = new Froakie(10, 30, 40, null, null, 1, 0, 30, atkS, 40, 60, 10);
        
        arena.start();
        
        Froakie p2 = new Froakie(10, 30, 40, null, null, 1, 0, 30, atkS, 40, 60, 10, 0);
    }
}
