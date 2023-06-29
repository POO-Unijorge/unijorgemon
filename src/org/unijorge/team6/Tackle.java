package org.unijorge.team6;

import org.unijorge.core.Ataque;
import org.unijorge.core.interfaces.Normal;

public class Tackle extends Ataque implements Normal{

    public Tackle(int dano, String nome, double pBaseAtaque) {
        super(dano, nome, pBaseAtaque);
        //TODO Auto-generated constructor stub

       public int getLevelProgress(){
                return levelProgress;
            }

            public void setLevelProgress(int levelProgress){
                this.levelProgress = levelProgress; 
            }
    }
    
}
