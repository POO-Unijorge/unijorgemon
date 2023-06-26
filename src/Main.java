<<<<<<< HEAD
import org.unijorge.team6.JumpKick;
import org.unijorge.team6.Lopunny;
=======
import org.unijorge.core.Arena;
import org.unijorge.core.Pokemon;
import org.unijorge.team1.Scyter;
import org.unijorge.team1.Swarm;
import org.unijorge.team5.Froakie;
import org.unijorge.team6.Eevee;
import org.unijorge.team6.Tackle;
>>>>>>> c1734c5a2de69e2d172d231e227ab1fbb1a86a91

public class Main {
    public static void main(String[] args) {
        //codigo zuretado, não executa, blz? 
        //é só ideia!
        System.out.println("ola");
<<<<<<< HEAD
        JumpKick atkS = new JumpKick(20, "ola", "inseto", 10);
        Lopunny p1 = new Lopunny (10, 30, 40, null, null, 1, 0, 30, atkS, 40, 60);
=======
        
        Swarm atkS = new Swarm(20, "ola", "inseto", 10);
        Scyter p1 = new Scyter(10, 30, 40, null, null, 1, 0, 30, atkS, 40, 60, 10);
        Weedle weedle = new Weedle(10, 30, 40, null, null, 1, 0, 30, atkS, 40, 60, 15, 20); 
        
        Eevee eevee = new Eevee(5, 20.0, 40.0, null, "Eevee", 1, 0, 55, tackle, 50, 55, 15, 15);
        
>>>>>>> c1734c5a2de69e2d172d231e227ab1fbb1a86a91
        System.out.println(p1.retornaTipoDoPokemon().get(0).toString());
        System.out.println(p1.getAtk().retornaTipoDoAtaque().get(0).toString());
        ///
        System.out.println(p1.retornaTipoDoPokemonStr());
        System.out.println(p1.getAtk().retornaTipoDoAtaqueStr());
        System.out.println(p1.getAcuracia());        
        //Froakie p2 = new Froakie(10, 30, 40, null, null, 1, 0, 30, atkS, 40, 60, 10);
        
        
        Froakie p2 = new Froakie(10, 30, 40, null, null, 1, 0, 30, atkS, 40, 60, 10);
    }
}
