import org.unijorge.core.Arena;
import org.unijorge.core.enums.Sexo;
//import org.unijorge.team1.Scyter;
import org.unijorge.team1.Swarm;
import org.unijorge.team5.Froakie;

public class Main {
    public static void main(String[] args) {
        Swarm atkS = new Swarm(20, "ola", "inseto", 10);
        Weedle weedle = new Weedle(10, 30, 40, Sexo.M, "Weedle", 1, 0, 30, atkS, 40, 60, 15, 20); 
        Froakie p2 = new Froakie(10, 30, 40, Sexo.F, "Froakie", 1, 0, 30, atkS, 40, 60, 10, 20);

        Arena arena = new Arena(weedle, p2);
        arena.start();
    }
}
