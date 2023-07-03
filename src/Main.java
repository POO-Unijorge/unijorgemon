import org.unijorge.core.Arena;
import org.unijorge.core.Ataque;
import org.unijorge.core.Pokemon;
import org.unijorge.team1.Scyter;
import org.unijorge.team1.Swarm;
import org.unijorge.team5.Froakie;
import org.unijorge.team5.Fennekin;
import org.unijorge.team8.Eevee;

public class Main {
    public static void main(String[] args) {
        //codigo zuretado, não executa, blz? 
        //é só ideia!

        //JumpKick atkS = new JumpKick(20, "ola", "inseto", 10);
        //Lopunny p1 = new Lopunny (10, 30, 40, null, null, 1, 0, 30, atkS, 40, 60);

        
        //Swarm atkS = new Swarm(20, "ola", "inseto", 10);
        Scyter scyter = new Scyter(10, 30, 40, null, "Scyter", 1, 0, 30, new Ataque(110, "Aerial Ace", 100), 40, 60, 10, 0);
        //Weedle weedle = new Weedle(10, 30, 40, null, null, 1, 0, 30, atkS, 40, 60, 15, 20); 
        
        Eevee eevee = new Eevee(5, 20.0, 40.0, null, "Eevee", 1, 0, 55, new Ataque(50, "Tackle", 60), 50, 55, 15, 15);
        
        Arena arena = new Arena(scyter, eevee);

        //Froakie p2 = new Froakie(10, 30, 40, null, null, 1, 0, 30, atkS, 40, 60, 10);
        //Bubbles bubble = new Bubbles(20)
        
        arena.start();
        
        //Froakie p2 = new Froakie(10, 30, 40, null, null, 1, 0, 30, atkS, 40, 60, 10, 0);
    }
}
