import org.unijorge.core.team6;
import org.unijorge.core.Ataque;
import org.unijorge.core.interfaces.Normal;

public class JumpKick extends Ataque implements Normal{
    public JumpKick(int dano, String nome, String tipo, double pBaseAtaque) {
        super(dano, nome, tipo, pBaseAtaque);
        }
         // Get e Set nos atributos
            public void set Hp(int hp){
                if (getHp < 50){
                    this.setHP(getHP()+1);
                    // Verificando se a vida da coelhinha da menor que 50, estando vai acresentar 1 ajudinha.
                } else {
                    this.setHp(this.getHp()-hp); // Colocando o dano
                }
                if (getHp() <= 0){}
                else if (getHp() > 50){
                    SuperLopnnuy superLopunny = new SuperLopnnuy();
                    // Batalhar com o personagem em espefico ela vai virar supe lopunny
                    // colocar o super atk
                    superLopunny.setHp(getHp());
                    superLopunny.setAtk(getAtk());
                    superLopunny.setAtkName("Super JumpKick");
                    // get do super
                    this.hp = superLopunny.getHp();
                    this.atk = superLopunny.getAtk();
                }

            public int getLevelProgress(){
                return levelProgress;
            }

            public void setLevelProgress(int levelProgress){
                this.levelProgress = levelProgress;

            }

          }
        }
     
