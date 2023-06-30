import org.unijorge.core.team6;
import org.unijorge.core.Ataque;
import org.unijorge.core.interfaces.Normal;

public class VoltTackle extends Ataque implements Eletrico{
    public VoltTackle(int dano, String nome, String tipo, double pBaseAtaque) {
        super(dano, nome, tipo, pBaseAtaque);
        }
         // Get e Set nos atributos
            public void set Hp(int hp){
                if (getHp < 15){
                    this.setHP(getHP()+1);
                } else {
                    this.setHp(this.getHp()-hp); // Colocando o dano
                }
                if (getHp() <= 0){}
                else if (getHp() > 50){
                    Pikachu Pikachu = new Raichu();
                    // Batalhar com o personagem em espefico ele virar o Raichu
                    // colocar o super atk
                    Raichu.setHp(getHp());
                    Raichu.setAtk(getAtk());
                    Raichu.setAtkName("Super Volttackle");
                    // get do pokemon
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
