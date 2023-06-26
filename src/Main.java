import org.unijorge.team1.Scyter;
import org.unijorge.team1.Swarm;
import org.unijorge.team5.Froakie;
import org.unijorge.team6.Eevee;
import org.unijorge.team6.Tackle;

public class Main {
    public static void main(String[] args) {
        //codigo zuretado, não executa, blz? 
        //é só ideia!
        System.out.println("ola");
        
        Swarm atkS = new Swarm(20, "ola", "inseto", 10);
        Tackle tackle = new Tackle(60, "Tackle", 50);
        Bubbles bubbles = new Bubbles(20,"bubbles","Agua",50);

        Scyter p1 = new Scyter(10, 30, 40, null, null, 1, 0, 30, atkS, 40, 60, 10, 0);
        
        Weedle weedle = new Weedle(10, 30, 40, null, null, 1, 0, 30, atkS, 40, 60, 15, 20); 
        
        Eevee eevee = new Eevee(5, 20.0, 40.0, null, "Eevee", 1, 0, 55, tackle, 50, 55, 15, 15);
        
        System.out.println(p1.retornaTipoDoPokemon().get(0).toString());
        System.out.println(p1.getAtk().retornaTipoDoAtaque().get(0).toString());
        ///
        System.out.println(p1.retornaTipoDoPokemonStr());
        System.out.println(p1.getAtk().retornaTipoDoAtaqueStr());
        System.out.println(p1.getAcuracia());
        
        System.out.println(eevee.retornaTipoDoPokemon().get(0).toString());
        System.out.println(eevee.getAtk().retornaTipoDoAtaque().get(0).toString());
        ///
        System.out.println(eevee.retornaTipoDoPokemonStr());
        System.out.println(eevee.getAtk().retornaTipoDoAtaqueStr());
        System.out.println(eevee.getAcuracia());
        
        Froakie p2 = new Froakie(10, 30, 40, null, null, 1, 0, 30, atkS, 40, 60, 10, 20);
        
    }
}
