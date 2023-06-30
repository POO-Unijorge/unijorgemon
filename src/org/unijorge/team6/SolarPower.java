import org.unijorge.core.team6;
import org.unijorge.core.Ataque;
import org.unijorge.core.interfaces.Normal;

public class SolarPower extends Ataque implements Normal{
    public SolarPower(int dano, String nome, String tipo, double pBaseAtaque) {
        super(dano, nome, tipo, pBaseAtaque);
        }
         // Get e Set nos atributos
            public void set Hp(int hp){
                if (getHp < 33){
                    this.setHP(getHP()+1);   
                } else {
                    this.setHp(this.getHp()-hp); // Colocando o dano
                }
                

          }
        }
