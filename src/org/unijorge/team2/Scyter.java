public class Scyther extends Animal implements Inseto{


    public int setHp(int hp){
        if(getHp()<50){
            if(getSpd()+10<95){
                setSpd(getSpd()+10);
            }
            if(getAtk()+10<95){
                setAtk(getAtk()+10);
            }
            setHp(getHp()+4;)
        }
    }


}
