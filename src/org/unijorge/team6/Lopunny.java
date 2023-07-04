import org.unijorge.core.Ataque;
import org.unijorge.core.Pokemon;
import org.unijorge.core.enums.Sexo;
import org.unijorge.core.interfaces.Normal;

public class Lopunny extends Pokemon implements Normal{

        public Lopunny(int idade, double peso, double tamanho, Sexo sexo, String nomeCientifico, int level,
            int levelProgress, int hp, Ataque atk, int def, int spd, int acuracia, int evasao) {
        super(idade, peso, tamanho, sexo, nomeCientifico, level, levelProgress, hp, atk, def, spd, acuracia, evasao);
        //TODO Auto-generated constructor stub
    }

        public String desenhoPokemon(){
        return "(*)_(*)";
    } 


    class SuperLopnnuy extends Lopunny{

        public SuperLopnnuy(int idade, double peso, double tamanho, Sexo sexo, String nomeCientifico, int level,
                int levelProgress, int hp, Ataque atk, int def, int spd, int acuracia, int evasao) {
            super(idade, peso, tamanho, sexo, nomeCientifico, level, levelProgress, hp, atk, def, spd, acuracia, evasao);
            //TODO Auto-generated constructor stub
        }
        
    }

    public void setHp(int hp){
        if (hp < 50){
            this.setHp(getHp()+1);
            // Verificando se a vida da coelhinha da menor que 50, estando vai acresentar 1 ajudinha.
        } else {
            this.setHp(this.getHp()-hp); // Colocando o dano
        }
        if (getHp() <= 0){}
        else if (getHp() > 50){
         
            SuperLopnnuy superLopunny = new SuperLopnnuy(this.getIdade(), this.getPeso(), this.getTamanho(),  
            this.getSexo(), this.getNomeCientifico(), this.getLevel(), this.getLevelProgress(), this.getHp()+30,
             this.getAtk(), this.getDef(), this.getSpd(), this.getAcuracia(),getEvasao()) ;
             // Criou a classe do pok evoluido
            // Batalhar com o personagem em espefico ela vai virar super lopunny
            // colocar o super atk
            superLopunny.setHp(getHp());
            superLopunny.setAtk(getAtk());
            superLopunny.getAtk().setNome("Super JumpKick");
            // get do super
            setHp(superLopunny.getHp());
            setAtk(superLopunny.getAtk());
        }

        
    }
}